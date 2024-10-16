import java.util.Scanner;

public class Exercicio3 {
    private int inteiro;
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int inteiro = leitor.nextInt();
        String binario = Integer.toBinaryString(inteiro);
        String octal = Integer.toOctalString(inteiro);
        String hexadecimal = Integer.toHexString(inteiro);
        System.out.println("O número " + inteiro);
        System.out.println("Em binário é: " + binario);
        System.out.println("Em octal é: " + octal);
        System.out.println("Em hexadecimal é: " + hexadecimal);
    }
}