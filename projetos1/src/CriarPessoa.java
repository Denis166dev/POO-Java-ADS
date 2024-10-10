public class CriarPessoa {
    public static void main(String[] args) {
        Pessoa criarpessoa = new Pessoa("Denis", 18, "Esperança");
        System.out.println(criarpessoa.getNome());
        System.out.println(criarpessoa.getIdade());
        System.out.println(criarpessoa.getEndereco());
        criarpessoa.getDados();
    }
}