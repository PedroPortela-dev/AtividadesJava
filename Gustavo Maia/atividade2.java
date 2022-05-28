import java.util.Scanner;

// - atividade 3 - : A sequência Fibonacci

public class atividade2 {

    //CÓDIGO ABAIXO FOI COPIADO, mas eu entendi, eu acho

    static long fibo(int n) {
        int F = 0;    
        int ant = 0;   

        for (int i = 1; i <= n; i++) {

            if (i == 1) { 
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }

        }

        return F;
    }
    
    //Abaixo fui eu :D

    public static void main(String[] args) {

        Scanner recebe = new Scanner(System.in);

        System.out.println("--------Sequência de Fibonacci--------");
        System.out.println("O que é?");
        System.out.println("Uma sucessão de números que foi descrita pelo matématico italiano Leonardo Fibonacci.");
        System.out.println("Pressione 'enter' para continuar...");
            recebe.nextLine();

        System.out.println("É uma sequência infinita, sua formula é:  ");
        System.out.println("F(n + 2) = F(n + 1) + F(n) , com n 'maior ou igual a' 1 e F(1) = F(2) = 1 ");
        System.out.println("Pressione 'enter' para continuar...");
            recebe.nextLine();

        System.out.println("Vamos testar!");
        System.out.println("Digite um número de 0 a 29 (valor da posição):   ");
            String nsrt = recebe.nextLine();
                int n = Integer.parseInt(nsrt);

        System.out.print("O valor dessa posição (" + n + ") é: " + atividade2.fibo(n));
    }

}