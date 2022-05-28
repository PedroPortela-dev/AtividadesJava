import java.util.Random;
import java.util.Scanner;

public class NumToBoolean {
    
    public static boolean numToBoolean(int p) {
        boolean portelaBooleanado = true;
        if (p == 0) {
            portelaBooleanado = false;
        } 
        return portelaBooleanado;
    }

    public static void enzo() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Random davi = new Random();
        Scanner tomaz = new Scanner(System.in);
        Scanner duda = new Scanner(System.in);
        
        enzo();

        System.out.println("----------- Convertor de array portela para \"array\" portela booleanado -----------");
        System.out.println("Quantas posições na Array?");
        int position = tomaz.nextInt();

        System.out.println("\nAVISO: CTRL + C PARA SAIR DO LOOP");
        System.out.println("Não me responsabilizo por possíveis explosões de torradeiras");
        System.out.println("Aperte enter para iniciar...");

        duda.nextLine();

        System.out.println();

        int portela[] = new int[position];

        for (int i = 0; i < portela.length; i++) {
            portela[i] = davi.nextInt(2); 
            System.out.print(portela[i]+" ");
            System.out.println(numToBoolean(portela[i]));
        }

        
    }
}
