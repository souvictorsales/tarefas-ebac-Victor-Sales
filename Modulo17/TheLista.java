package Modulo17;

import java.util.ArrayList;
import java.util.List;

public class TheLista<T extends CarrosMod17> {

    private List<T> listaCarros;

    public TheLista() {
        this.listaCarros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        listaCarros.add(carro);
    }

    public void listarCarros() {
        for (T carro : listaCarros) {
            System.out.println("Modelo: " + carro.getModelo() + ", Tipo: " + carro.getTipo());
        }
    }

    public List<T> getListaCarros() {
        return listaCarros;
    }

}
