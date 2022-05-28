import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
            
        System.out.println(" Vamos Calcular o valor de Fibonacci");
        System.out.println("-------------------------------------\n");

        Scanner Input = new Scanner(System.in);

        System.out.print("Digite a posição: ");
        int n = Input.nextInt();

        int an = (int)((Math.pow((1+Math.sqrt(5))/2, n) - Math.pow((1-Math.sqrt(5))/2, n))/Math.sqrt(5)); 

        System.out.println("O valor de fibonacci da posição "+n+" é igual a: "+an);
    }
}
