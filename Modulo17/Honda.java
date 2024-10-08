package Modulo17;

public class Honda extends CarrosMod17 {
    
    public Honda(String modelo) {
        super(modelo);
    }

    @Override
    String getTipo() {
        return "SUV";
    }

}
