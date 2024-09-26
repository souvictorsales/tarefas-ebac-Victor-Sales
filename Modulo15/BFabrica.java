public class BFabrica extends Fabrica {

    @Override
    public Compacto criarCompacto(){
        return  new BCompacto();
    }

    @Override
    public Sedan criarSedan(){
        return  new BSedan();
    }

}
