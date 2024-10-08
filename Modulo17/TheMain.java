package Modulo17;

public class TheMain {

    public static void main(String[] args) {
        TheLista<CarrosMod17> gerenciador = new TheLista<>();

        gerenciador.adicionarCarro(new Toyota("Toyota Corolla"));
        gerenciador.adicionarCarro(new Honda("Honda CR-V"));

        System.out.println("Lista de Carros:");
        gerenciador.listarCarros();
    }

}
