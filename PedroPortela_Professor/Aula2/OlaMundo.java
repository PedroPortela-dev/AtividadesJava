import java.util.Scanner;

/**
 * OlaMundo
 */
public class OlaMundo {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        
        /*
        byte e = 127; // 8 bits==1Byte.... 2^8 -128-127
        short f = 10; // 16 bits  2^16  -32000...32000 
        int num1 = 124;// 32 bits
        long num2 = 13;// 64 bits
        long totalMilliSegundos =  System.currentTimeMillis();

        float num3 = 56.74f; // 32 bits
        double b= 56.75; // 64 bits

        char c = 'B';
        String nome = "Pedro Portela";

        boolean d = false; // 1 bit
        */
        /*
        System.out.println("Digite seu Nome:   ");
        String nome = Input.nextLine();

        System.out.println(nome + " vc  é lindo");
        */

        long totalMilliSegundos =  System.currentTimeMillis();

        long totalSegundos = totalMilliSegundos/1000-10800;
        int segundosAtuais = (int)totalSegundos%60;
        
        int totalminutos = (int)totalSegundos/60;
        int atualminutos = totalminutos%60;
        
        int totalhoras = totalminutos/60;
        int atualhoras = totalhoras%24;

        System.out.println(atualhoras+":"+atualminutos+":"+segundosAtuais);

        String numero= "86";

        int num1 = 10, num2 = 17, num3;
        double num4 = 76, num5;

        num5=Math.hypot(num1, num2);

        num1 = Integer.parseInt(numero);

        System.out.println(numero);
    }
}