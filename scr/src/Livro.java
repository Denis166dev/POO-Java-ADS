//Crie uma classe Livro com atributos para título, autor e preço. Crie objetos Livro e exiba informações sobre os livros.
public class Livro {
    private String titulo;
    private  String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public double getPreco(){
        return preco;
    }
}
