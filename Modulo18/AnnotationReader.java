public class AnnotationReader {

    public static String getTabelaNome(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            return tabela.nome();
        }
        return null;
    }

    public static void main(String[] args) {
        String nomeTabela = getTabelaNome(Produtoss.class);
        System.out.println("Nome da tabela: " + nomeTabela);
    }
}
