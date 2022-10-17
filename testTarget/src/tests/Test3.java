package tests;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import tests.dados.Dados;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String [] args) throws Exception {
        dadosXML();
    }

    private static void dadosXML() throws Exception{

        File fXmlFile = new File("Dados.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        ArrayList<Dados> dado = new ArrayList<>();
        ArrayList<Double> arrayMensal = new ArrayList<>();

        System.out.println("Root do elemento: " + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("row");

        System.out.println("----------------------------");
        for (int count = 0; count < nList.getLength(); count++) {
            Node nNode = nList.item(count);
            System.out.println("\n");

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;


                Dados dadoTotal = new Dados(Integer.valueOf(eElement.getElementsByTagName("dia").item(0).getTextContent()), Double.valueOf(eElement.getElementsByTagName("valor").item(0).getTextContent()));



                if(dadoTotal.getValor() != 0.0){
                    dado.add(dadoTotal);
                    arrayMensal.add(Double.valueOf(eElement.getElementsByTagName("valor").item(0).getTextContent()));
                }

                System.out.println(dadoTotal);

            }

        }

        float media = 0;
        int maior = 0;

        for(int i = 0; i<arrayMensal.size(); i++){
            media += arrayMensal.get(i);
        }

        Dados min = (Dados) Collections.min(dado);
        System.out.println("O menor faturamento foi no" + min);

        Dados max = (Dados) Collections.max(dado);
        System.out.println("O maior faturamento foi no" + max);

        float totalMedia = (float) ((double) media/arrayMensal.size());
        System.out.println("A média mensal é de: "+(totalMedia));

        for(int i = 0; i<arrayMensal.size(); i++){
            if(totalMedia < arrayMensal.get(i)){
                maior++;
            }
        }
        System.out.println("O número de vezes em que o faturamento diário foi maior do que a média mensal foi: "+maior);

    }
}
