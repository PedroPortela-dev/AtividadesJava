import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o "+(i+1)+" valor: ");
            vetor[i] = input.nextInt();
        }

        int maiorValor = vetor[0];
        int posicao = 0;

        for (int i = 1; i < vetor.length; i++) {
         
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("O Maior valor é "+maiorValor+" ele ocupa a posicao "+ posicao);
    }
}
