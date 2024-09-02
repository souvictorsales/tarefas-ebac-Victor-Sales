package Modulo10;
import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int NUM_NOTAS = 4;
    double somaNotas = 0.0;

    
    for (double i = 1; i <= NUM_NOTAS; i++) {
        System.out.println("Informe a nota " + i + ":");
        double nota = scanner.nextDouble();
        
        somaNotas += nota;
    }

    double media = somaNotas / NUM_NOTAS;

    System.out.printf("A média das quatro notas do aluno(a) é: %.2f%n", media);

    //CORREÇÃO PARA INCREMENTAR O RESULTADO
    if (media >= 7){
        System.out.println("Aluno(a) está APROVADO!!!");
    } else if (media >= 5){
        System.out.println("Aluno(a) está de RECUPERAÇÃO.");
    } else{
        System.out.println("Aluno(a) está REPROVADO.");
    }

    scanner.close();
}
}