import java.util.Scanner;

public class MaiorValor {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double num1 = Input.nextDouble();

        System.out.print("Digite um outro valor: ");
        double num2 = Input.nextDouble();

        double maiorValor = (Math.abs(num1+num2)+Math.abs(num1-num2))/2; // modulo de 2 = 2, modulo -2 = 2
        double menorValor = (Math.abs(num1+num2)-Math.abs(num1-num2))/2;

        System.out.println("\nO Maior é: "+maiorValor);
        System.out.println("O Menor é: "+menorValor);
    }
}
