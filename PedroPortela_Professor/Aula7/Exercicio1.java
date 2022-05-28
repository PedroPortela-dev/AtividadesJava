import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercicio1
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[4];
        boolean boolvet[] = new boolean[vetor.length];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o "+(i+1)+" valor: ");
            vetor[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            boolvet[i] = (vetor[i] > 0);
        }

        System.out.println(Arrays.toString(boolvet));

    }
}