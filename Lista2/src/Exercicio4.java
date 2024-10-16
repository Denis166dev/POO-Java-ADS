import java.util.Scanner;

public class Exercicio4 {
    private double valor;
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor do tipo double:");
        double valor = leitor.nextDouble();
        conversao(valor);
    }

    public static void conversao(Double valor) {
        int valorInt = valor.intValue();
        long valorLong = valor.longValue();
        float valorFloat = valor.floatValue();
        byte valorByte = valor.byteValue();
        System.out.println(valorInt);
        System.out.println(valorLong);
        System.out.println(valorFloat);
        System.out.println(valorByte);
    }
}