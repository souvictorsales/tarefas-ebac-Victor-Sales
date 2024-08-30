package Modulo9;

import  java.util.Scanner;

public class ProjetoMod9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número qualquer:");
        double num1 = scanner.nextDouble();
        Double num2 = num1;

        System.out.println("O número que você escolheu foi:" +num2);

        scanner.close();
    }
    
}
