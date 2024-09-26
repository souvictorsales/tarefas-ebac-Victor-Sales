public class Cliente {
    public static void main(String[] args) {
        Fabrica fabricaA = new AFabrica();
        Fabrica fabricaB = new BFabrica();

        Compacto compactoA = fabricaA.criarCompacto();
        Sedan sedanB = fabricaB.criarSedan();

        System.out.println(compactoA.getDescricao());
        System.out.println(sedanB.getDescricao());
        
    }

}
