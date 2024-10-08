package Modulo17;

public abstract  class CarrosMod17 {

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CarrosMod17(String modelo){
        this.modelo = modelo;
    }

    abstract String getTipo();

}
