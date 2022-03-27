import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        //- Atividade 1 - : Troca de valores entre duas variáveis

        int a, b, a2; 
        Scanner recebe = new Scanner(System.in);

        System.out.println("Digite um número (valor A):   ");
            String n1srt = recebe.nextLine();
        a = Integer.parseInt(n1srt); //"Transformando" a string em int

        System.out.println("Digite outro número (valor B):   ");
            String n2srt = recebe.nextLine();
        b = Integer.parseInt(n2srt); //"Transformando" a string em int

        a2 = a; //Para não perder o valor de A, já que ele vai "trocar" de valor com B
        a = b; 
        b = a2; 

        System.out.println("O valor de A é " + a);
        System.out.println("E o valor de B é " + b);
        System.out.println("Não, pera...");

        /*
        ----------------------------------OUTRO MÉTODO :D------------------------------------
        System.out.println("O valor de A é "+b+", e o valor de B é "+a+".");
        Também funcionaria... ¯\_(ツ)_/¯
        */

        System.out.println("Continuar? ('y' para sim, 'n'  para 'não')");
            String answer1 = recebe.nextLine();

        // - Atividade 2 - : Maior valor entre A e B

        int BigN = Math.max(a, b);

        if (answer1.equals("y")) {
            System.out.println("O maior valor é " + BigN);
        } else {
            System.out.println("Também não quero mais brincar. >:(");
        }
        
    }
}

