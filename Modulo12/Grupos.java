package Modulo12;
import java.util.ArrayList;
import java.util.Scanner;

public class Grupos  {
    public static void main(String[] args) {
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de pessoas para cadastrar:");
        int numPessoas = scanner.nextInt();
        scanner.nextLine(); 
        
        
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Digite o nome da pessoa #" + (i + 1) + ":");
            String nome = scanner.nextLine();
            
            String sexo;
            while (true) {
                System.out.println("Digite o sexo da pessoa #" + (i + 1) + " (M/F):");
                sexo = scanner.nextLine().toUpperCase();
                
                if (sexo.equals("M") || sexo.equals("F")) {
                    break;
                } else {
                    System.out.println("Sexo inválido. Por favor, use 'M' para masculino ou 'F' para feminino.");
                }
            }
            
            
            if (sexo.equals("M")) {
                masculino.add(nome);
            } else {
                feminino.add(nome);
            }
        }       
        scanner.close();
        
        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
        
        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}