import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        double n1, n2, soma, sub, multi, div, res;
        int operação;
        String resposta = "N";

        System.out.println("\n------------------------ Kalku-ladora ------------------------");

        do {
        System.out.println("\nDigite um número:   ");
            n1 = input.nextDouble();
        System.out.println("\nDigite outro número:   ");
            n2 = input.nextDouble();
        
        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        res = n1 % n2;

        System.out.println("\nQual operação? Entre "+n1+" e "+n2+", respectivamente.");
        System.out.println("\n------------------------");
        System.out.println("[1] Adição '+'");
        System.out.println("[2] Subtração '-'");
        System.out.println("[3] Multiplicação '*'");
        System.out.println("[4] Divisão '/'");
        System.out.println("[5] Resto '%'");
        System.out.println("------------------------");
            operação = input.nextInt();

        switch ((int)operação) {
            case 1:
            System.out.println("\n\n"+n1+" + "+n2+" = ");
            System.out.println(soma);
            break;

            case 2:
            System.out.println("\n\n"+n1+" - "+n2+" = ");
            System.out.println(sub);
            break;

            case 3:
            System.out.println("\n\n"+n1+" x "+n2+" = ");
            System.out.println(multi);
            break;

            case 4:
            System.out.println("\n\n"+n1+" / "+n2+" = ");
            System.out.println(div);
            break;

            case 5:
            System.out.println("\n\n"+n1+" % "+n2+" = ");
            System.out.println(res);
            break;
            }
            System.out.println("\nCalcular de novo? [S]im ou [N]ão?");
                resposta = input2.nextLine();
            
            if (resposta.equalsIgnoreCase("N")) {
                System.out.println("\nVolte sempre! :)");
            }
        
        } while (resposta.equalsIgnoreCase("S"));
    }
}
