import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        int a, b, a2; 
        Scanner recebe = new Scanner(System.in);

        System.out.println("Digite um número (valor A):   ");
        String n1srt = recebe.nextLine();
        a = Integer.parseInt(n1srt); //"Transformando" a string em um inteiro.

        System.out.println("Digite outro número (valor B):   ");
        String n2srt = recebe.nextLine();
        b = Integer.parseInt(n2srt); //"Transformando" a string em um inteiro.

        a2 = a; //Para não perder o valor de A, já que ele vai "virar" B.
        a = b; 
        b = a2; 

        System.out.println("O valor de A é "+a);
        System.out.println("E o valor de B é "+b);
        System.out.println("Não, pera...");

        /*
        ----------------------------------OUTRO MÉTODO :D------------------------------------
        int a, b;
        Scanner recebe = new Scanner(System.in);

        System.out.println("Digite um número (valor A):   ");
        String n1srt = recebe.nextLine();
        a = Integer.parseInt(n1srt);

        System.out.println("Digite outro número (valor B):   ");
        String n2srt = recebe.nextLine();
        b = Integer.parseInt(n2srt);

        System.out.println("O valor de A é "+b+", e o valor de B é "+a+".");
        
        Também funcionaria... ¯\_(ツ)_/¯
        */
}
}