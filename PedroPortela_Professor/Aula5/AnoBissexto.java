import java.util.Scanner;

public class AnoBissexto {

    /*
    Para saber se um ano é bissexto existe uma regra básica:
     os anos bissextos são aqueles múltiplos de 4,
    ou seja, a cada quatro anos temos um ano bissexto.

    Por outro lado, esses anos não são múltiplos de 100 (por exemplo,1800, 1900, 2100),
    exceto os múltiplos de 400 (por exemplo, 1600, 2000, 2400).
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Verificar se o ano é Bissexto");
        System.out.println("------------------------------------------------\n");

        char tentarNovamente;
        do {

            System.out.print("Digite um ano: ");
            int ano = input.nextInt();

            if(ano%400==0 || (ano%4==0 && ano%100!=0)){
                System.out.println(ano + " é Bissexto");
            }else{
                System.out.println(ano + " n é bissexto");
            }
            
            System.out.println("Deseja tentar novamente? [s]Sim ou [n]Não");
            tentarNovamente = input.next().charAt(0);

        }while(tentarNovamente == 's');

    }
    
}
