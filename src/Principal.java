import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade");
        idade = leitura.nextInt();
        System.out.println("Ele tem "+idade+" Anos");

    }
}