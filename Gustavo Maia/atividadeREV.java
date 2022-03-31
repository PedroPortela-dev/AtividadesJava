import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        //- Atividade 1 - : Troca de valores entre duas variáveis

        int a, b, a2; 
        Scanner recebe = new Scanner(System.in);
        Scanner recebe2 = new Scanner(System.in);

        System.out.println("-----------Troca entre variáveis-----------");

        System.out.println("Digite um número inteiro (valor A):   ");
           a = recebe.nextInt(); 

        System.out.println("Digite outro número inteiro (valor B):   ");
            b = recebe.nextInt(); 

        a2 = a; //Para não perder o valor de A, já que ele vai "trocar" de valor com B
        a = b; 
        b = a2; 

        System.out.println("O valor de A é " + a);
        System.out.println("E o valor de B é " + b);
        System.out.println("Não, pera...");

        System.out.println("Guarde esses números: "+a+" e "+b);
        System.out.println("Pressione 'enter' para continuar...");
            recebe2.nextLine();
            
        /*
        ----------------------------------OUTRO MÉTODO :D------------------------------------
        System.out.println("O valor de A é "+b+", e o valor de B é "+a+".");
        Também funcionaria... ¯\_(ツ)_/¯
        */

        // - Atividade 2 - : Maior valor entre A e B

        System.out.println("-----------Maior valor-----------");

        int BigN = Math.max(a, b);

        System.out.println("O maior valor é " + BigN);
        System.out.println("Pressione 'enter' para continuar...");
            recebe2.nextLine();
        

        // - Atividade 3 - A sequência de Fibonacci

        System.out.println("-----------Sequência de Fibonacci-----------");

        System.out.println("O que é?");
        System.out.println("Uma sucessão de números que foi descrita pelo matématico italiano Leonardo Fibonacci.");
        System.out.println("Pressione 'enter' para continuar...");
            recebe2.nextLine();

        System.out.println("É uma sequência infinita, sua formula é:  ");
        System.out.println("F(n + 2) = F(n + 1) + F(n) , com n 'maior ou igual a' 1 e F(1) = F(2) = 1 ");
        System.out.println("Pressione 'enter' para continuar...");
            recebe2.nextLine();

        System.out.println("Vamos testar!");
        System.out.println("Lembra daqueles dois números inteiros que você digitou no início?");
        System.out.println(a+" e "+b);
        System.out.println("Foram esses, certo? Pressione 'enter' para continuar...");
            recebe2.nextLine();

        System.out.println("Eles podem representar uma posição na sequência de Fibonacci.");
        System.out.println("Com uma equação simples (ou não), podemos chegar no número dessa posição.");
        System.out.println("Pressione enter para continuar...");
            recebe2.nextLine();
        
        int a2F = (int) ((Math.pow(((1 + Math.sqrt(5))/2), a2) - Math.pow(((1 - Math.sqrt(5))/2), a2))/Math.sqrt(5));
        int aF = (int) ((Math.pow(((1 + Math.sqrt(5))/2), a) - Math.pow(((1 - Math.sqrt(5))/2), a))/Math.sqrt(5));

        System.out.println("A posição "+a2+" na sequência Fibonnaci é: "+a2F);
        System.out.println("A posição "+a+" na sequência Fibonnaci é: "+aF);
    }
}

// ficou muito bom cara, gostei muito, parabens mesmo
