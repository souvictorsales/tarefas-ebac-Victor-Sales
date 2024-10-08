package Modulo17;

public class Toyota extends CarrosMod17{
    
    public Toyota(String modelo) {
        super(modelo);
    }

    @Override
    String getTipo() {
        return "Sedan Médio";
    }

}
