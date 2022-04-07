import java.util.Random;
import java.util.Scanner;
import javax.swing.event.SwingPropertyChangeSupport;

public class LuckyNumber {
        
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        Scanner input = new Scanner(System.in); 
        String resposta = "N";

        System.out.println("\n------------------------ Lucky Number ------------------------");
        System.out.println("Encontre o número da sorte!");
        System.out.println("Você terá 6 tentativas para acertar o número da sorte!");
        
        System.out.println("\nPressione 'enter' para começar...");
            enter.nextLine();

        do {
        Random gerador = new Random();
        int valormaximo = gerador.nextInt(200) + 1;
        int intervalo = gerador.nextInt(100) + 1;
        int valorminimo = (int) gerador.nextInt(valormaximo - intervalo) + 1;
        int LuckyNumber = (int) (Math.random() * (valormaximo - valorminimo) + valorminimo);
        int tentativas = 1;
        int n1;
        System.out.println("\n\nELE ESTÁ ENTRE "+valorminimo+" e "+valormaximo+"...");

        System.out.println("\nChute um número entre "+valorminimo+" e "+valormaximo+":");
        n1 = input.nextInt();
        System.out.println("---------------------------------------------");

        do {    
        if (n1 < LuckyNumber) {
            System.out.println("\n"+n1+" é menor que o número da sorte, tente de novo:   ");
                n1 = input.nextInt();
            System.out.println("---------------------------------------------------------");
        } else if (n1 > LuckyNumber) {
            System.out.println("\n"+n1+" é maior que o número da sorte, tente de novo:   ");
                n1 = input.nextInt();
            System.out.println("---------------------------------------------------------------------");
            }
        tentativas++;
        } while (n1 != LuckyNumber && tentativas != 6);

        if (n1 == LuckyNumber) {
            System.out.println("\nVOCÊ ACERTOU!!!!! SEU PRÊMIO É UM COOKIE! O número era: "+LuckyNumber);
        } else if (tentativas == 6) {
            System.out.println("\nEND GAME!");
            System.out.println("Suas tentativas acabaram, mais sorte na próxima!");
        }    
        Scanner recebe = new Scanner(System.in);
        System.out.println("\nTentar novamente? [S]im ou [N]ão?");
            resposta = recebe.nextLine();
        } while (resposta.equalsIgnoreCase("S"));    
    }
}

// Toma seu cookie 🍪
