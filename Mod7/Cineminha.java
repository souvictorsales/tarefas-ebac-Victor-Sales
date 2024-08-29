/**
 * @author Victor Sales
 */

public class Cineminha {
    public static void main(String[] args) {

        // Defini aqui alguns filmes que eu gosto como exemplo
        String[] filmes = {
            "1. O poderoso chefão",
            "2. Pulp fiction",
            "3. Gênio indomável",
            "4. Curtindo a vida adoidado",
            "5. Whiplash"
        };

        // O usuário escolhe um entre as opções
        System.out.println("Escolha um filme digitando o número correspondente");
        for (String filme : filmes) {
            System.out.println(filme);
        }

    
    }
}

