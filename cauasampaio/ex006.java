import java.util.Scanner;

public class ex006
{
    public static void main(String args[])
    {

        Scanner input = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int a = input.nextInt();

        System.out.println("---------------------------------------------------------------------------");

        System.out.print("Digite um número: ");                                                                             
        int b = input.nextInt();                                                                                

        System.out.println("AGORA SELECIONE UMA OPERACAO: ");                                                                       
        System.out.println("\n\n[1] Soma") ;                                                                            
        System.out.println("[2] Subtração");                                                                                          
        System.out.println("[3] Multiplicação");                                                                               
        System.out.println("[4] Divisão ");                                                                      
        System.out.println("------------------------- Digite uma opcao ---------------------------------");


        int opc = input.nextInt();

        switch(opc)
        {
            case 1:

                int soma = a + b;
                System.out.println("A soma e: " + soma);

                break;

            case 2:

                int diminui = a - b;
                System.out.println("A subtracao e: " + diminui);

                break;

            case 3:

                int multiplica = a * b;

                System.out.println("A multiplicaco e: " + multiplica);

                break;

            case 4:

                if (a < b){
                    System.out.println("Impossivel realizar calculo!! \n");
                }
                else
                {
                int divide = a / b;

                System.out.println("A divisão e: "+ divide);
                }
                break;
                
                default:

                    System.out.print("Operacao invalida!!");
        }

    }
}