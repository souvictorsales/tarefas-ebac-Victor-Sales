package Modulo13;

public class Aplicacao {
    public static void main (String args[]){
        System.out.println("******    PESSOA FÍSICA    ******");
        Fisica fisica = new Fisica();
        fisica.setNome("Fulano");
        fisica.setSobreNome("de Sousa");
        fisica.setCpf("15914898632");
        fisica.setImpostoRenda("1450");
        System.out.println("Nome: " + fisica.getNome() + " " + fisica.getSobreNome() + "\nCPF: " + fisica.getCpf() + "\nValor referente ao Imposto de Renda: " + fisica.getImpostoRenda());


        System.out.println("\n******    PESSOA JURÍDICA    ******");
        Juridica juridica = new Juridica();
        juridica.setCnpj("15468921547865");
        juridica.setNomeFantasia("Beltrano DEV");
        juridica.setiCMS("19%");
        System.out.println("Nome Empresa: " + juridica.getNomeFantasia() + " " + "\nCNPJ: " + juridica.getCnpj() + "\nAliquota ICMS: " + juridica.getiCMS());
    }

}
