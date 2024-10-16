public class CriarLivro {
    public static void main(String[] args) {
        Livro criarlivro = new Livro("Sua primeira venda em 24h", "Caio Martins",19.90);
        System.out.println(criarlivro.getTitulo());
        System.out.println(criarlivro.getAutor());
        System.out.println(criarlivro.getPreco());
    }
}