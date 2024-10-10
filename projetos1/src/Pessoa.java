public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    public String getEndereco(){
        return endereco;
    }
    public void getDados(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getEndereco());
    }
}