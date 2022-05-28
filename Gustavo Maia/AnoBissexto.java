import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int ano;
        String resposta;

        System.out.println("------------------ Descobrir Ano Bissexto ------------------");
        System.out.println("Acontece a cada quatro anos e duram 366 dias.");
        System.out.println("Começou a ser utilizado a partir de 1582 no calendário gregoriano, que é usado atualmente.");

        do {
        System.out.println("\nDigite um ano a partir de 1582:   ");
            ano = input.nextInt();

        while (ano < 1582) {
            System.out.println("O minímo é 1582... Chute outro número:   ");
                ano = input.nextInt();
        }

        if (ano%400==0 || (ano%4==0 && ano%100!=0))  {
            System.out.println("\n"+ano + " é um ano bissexto.");
        } else {
            System.out.println("\n"+ano + " não é um ano bissexto.");
        }

        System.out.println("\nTentar novamente? [S]im ou [N]ão?");
            resposta = input2.nextLine();
        
        if (resposta.equalsIgnoreCase("N")) {
            System.out.println("\nVolte sempre! :)");
        }
        
        } while (resposta.equalsIgnoreCase("S"));
    }
}

// Ainda não entendi qual é a desse Scanner, ele só funciona se usado com apenas um tipo de variável?
// Se eu colocar 'input' ali no resposta = input2.nextLine(); não vai funcionar. ¯\_(ツ)_/¯
