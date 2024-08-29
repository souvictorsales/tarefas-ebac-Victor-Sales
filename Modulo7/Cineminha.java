/**
 * @author Victor Sales
 */

import  java.util.Scanner;
public class Cineminha {
    public static void main(String[] args) {

        // Defini aqui alguns filmes que eu gosto como exemplo
        String[] filmes = {
            "1. O Poderoso Chefão",
            "2. Pulp Fiction",
            "3. Gênio Indomável",
            "4. Curtindo a Vida Adoidado",
            "5. Whiplash"
        };

        // O usuário escolhe um entre as opções
        System.out.println("Escolha um filme digitando o número correspondente:");
        for (String filme : filmes) {
            System.out.println(filme);
        }

        // Coletando valor escolhido pelo usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do filme escolhido: ");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= filmes.length){
            System.out.println("Você escolheu: "+ filmes[escolha - 1].substring(3) +".\nTenha um bom filme!!");    
        } else {
            System.out.println("Escolha inválida. Por favor, escolha um número entre 1 e" +filmes.length + ".");
        }

        scanner.close();
    
    }
}

