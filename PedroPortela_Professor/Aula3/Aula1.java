import java.util.Scanner;

/**
 * Aula1
 */
public class Aula1 {


    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double num1 = Input.nextDouble();

        System.out.print("Digite um outro valor: ");
        double num2 = Input.nextDouble();

        double num3 = num1; // num3 = num1 ..... num3 = 5; 
        num1 = num2; // num1 = num2 .... num1 = 2;
        num2 = num3; // num2 = num3 .... num2 = 5;

        System.out.println("Trocando as variaveis");

        System.out.println("A primeira agora essa: "+num1);
        System.out.println("A Segunda agora essa: "+num2);

    }
}