import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        char tentarNovamente;
        do {
            
            System.out.println("Vamos calcular");
            System.out.println("------------------------------------------------\n");
            
            System.out.print("Digite um valor: ");
            double valor1 = input.nextInt();
            System.out.println("------------------------------------------------\n");

            System.out.print("Digite um outro valor: ");
            double valor2 =  input.nextInt();
            System.out.println("------------------------------------------------\n");
        
            System.out.println("    [+] soma");
            System.out.println("    [-] subtração");
            System.out.println("    [*] multiplicação");
            System.out.println("    [/] divisão");
            System.out.println("    [%] resto de divisão");
            System.out.println("------------------------------------------------\n");
            
            System.out.println("Digite uma operação");
            char operacao = input.next().charAt(0);

            double result = 0;
            switch (operacao) {
                case '+':
                    result = valor1+valor2;
                    break;

                case '-':
                    result = valor1-valor2;
                    break;
                case '*':
                    result = valor1*valor2;
                    break;
                case '/':
                    result = valor1/valor2;
                    break;
                case '%':
                    result = valor1%valor2;
                    break;
            
                default:
                    break;
            }

            System.out.println(valor1+ " " + operacao +" "+ valor2 + " = "+result);

            System.out.println("Deseja tentar novamente? [s]Sim ou [n]Não");
            tentarNovamente = input.next().charAt(0);

        }while(tentarNovamente == 's');
    }
    
}
