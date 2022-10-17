package tests;

public class Test4 {
    public static void main(String [] args){

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double soma;
        double totalSP;
        double totalRJ;
        double totalMG;
        double totalES;
        double totalOUTROS;

        soma = sp + rj + mg + es + outros;

        totalSP = (sp * 100)/soma;
        totalRJ = (rj * 100)/soma;
        totalMG = (mg * 100)/soma;
        totalES = (es * 100)/soma;
        totalOUTROS = (outros * 100)/soma;


        System.out.println("O faturamento total da distribuidora foi de:  "+Math.round(soma));
        System.out.println("Sendo, a porcentagem do valor do estado de SP de: "+Math.round(totalSP)+"%");
        System.out.println("Sendo, a porcentagem do valor do estado de RJ de: "+Math.round(totalRJ)+"%");
        System.out.println("Sendo, a porcentagem do valor do estado de MG de: "+Math.round(totalMG)+"%");
        System.out.println("Sendo, a porcentagem do valor do estado de ES de: "+Math.round(totalES)+"%");
        System.out.println("Sendo, a porcentagem do valor do estado de Outros: "+Math.round(totalOUTROS)+"%");

    }
}
