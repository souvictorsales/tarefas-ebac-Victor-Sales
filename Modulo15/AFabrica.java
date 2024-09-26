public class AFabrica extends Fabrica {

    @Override
    public Compacto criarCompacto(){
        return  new ACompacto();
    }

    @Override
    public Sedan criarSedan(){
        return  new ASedan();
    }

}
