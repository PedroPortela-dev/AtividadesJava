import java.util.Scanner;

/**
 * CaçaNumero
 */
public class CaçaNumero {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        char tentarNovamente;
        do{
        
            System.out.println("Vamos tentar achar o numero da sorte");
            System.out.println("------------------------------------------------\n");

            int numSorte = (int)Math.round(Math.random()*99+1);

            System.out.println(numSorte);

            for (int i = 0; i < 6; i++) 
            {
                System.out.print("Digite um numero: ");
                int num = input.nextInt();
        
                if(num<numSorte){
                    System.out.println("Você digitou um numero menor que o da sorte");
                }else if(num > numSorte){
                    System.out.println("Você digitou um numero maior que o da sorte");
                }else{
                    System.out.println("Parabéns, vc acertou!!");
                    break;
                }

                System.out.println("------------------------------------------------\n");
            }

            System.out.println("Deseja tentar novamente? [s]Sim ou [n]Não");
            tentarNovamente = input.next().charAt(0);

        }while(tentarNovamente == 's');

    }
}