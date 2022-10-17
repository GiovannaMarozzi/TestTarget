package tests;

import java.util.Scanner;

public class Test5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.next();
        sc.close();

        System.out.println("Frase original: "+frase);
        System.out.println("Frase invertida: "+new StringBuilder(frase).reverse().toString());

    }
}
