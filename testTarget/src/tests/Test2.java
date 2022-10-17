package tests;

import java.util.ArrayList;
import java.util.Scanner;


public class Test2 {
    public static void main(String [] args){

        int a = 1;
        int b = 0;
        int aux;
        boolean exist = false;

        ArrayList<Integer> fibonacci = new ArrayList<Integer>();


        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 30; i++){
            aux = a;
            a = a + b;
            b = aux;
            fibonacci.add(aux);
        }

        System.out.print("Digite um número para a verificação: ");
        int number = sc.nextInt();
        sc.close();

        try{
            for(int x = 0; x < fibonacci.size(); x++){
                if(number == fibonacci.get(x)) {
                    exist = true;
                }
            }
        }catch (Exception e){
            System.out.println("Error: "+e);
        }

        System.out.println("O número digitado pelo usuário foi: "+number+" e o resultado se ele exite nos 30 primeiros numeros de fibonacci é: "+ exist);

    }
}
