import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Sexo: " + sexo;
    }
}

public class CadastroPessoas {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira nomes e sexos(M/F) (digite 'fim' para terminar):");

        while (true) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            // Verifica se o usuário quer terminar a entrada de dados
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            // Validar o sexo informado
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
                continue; // Retorna ao início do loop para tentar novamente
            }

            Pessoa pessoa = new Pessoa(nome, sexo);
            pessoas.add(pessoa);
        }

        // Ordena a lista de pessoas em ordem alfabética pelo nome
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        });

        // Imprime a lista de pessoas em ordem alfabética
        System.out.println("Pessoas em ordem alfabética:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        scanner.close();
    }
}