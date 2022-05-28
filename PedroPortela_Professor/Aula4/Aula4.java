import java.util.Scanner;

/**
 * Aula4
 */
public class Aula4 {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        
        System.out.println("Essa é a aula 4");
        System.out.println("------------------------------------------------------\n");

        int i;
        for(i=10;i<=20;i+=2){
            System.out.println(i);
        }

        Math.random();
    }
}


        /*System.out.print("Digite seu salario: R$");
        double salario = input.nextDouble();

        double aumento;

        aumento = (salario>1250)? 1.10:1.15;

        switch ((int)salario) {
            case 1250:
                System.out.println("Seu salario é de mil duzentos e cinquenta");
                break;

            case 1100:
                System.out.println("Seu salario é de mil e cem");
                break;

            case 1500:
                System.out.println("Seu salario é de mil e quinhentos");
                break;
            default:
                System.out.println("Seu salario n costa na lista");
                break;
        }


        /*
        Operação Comparação:
        > .... maior que
        < .... menor que
        >= ... maior ou igual
        <= ... menor ou igual
        == ... igual
        != ... diferente

        Operação Logicas
        && ... and (true && true) = true 
        || ... or  (true || false) = true
        ! .... not  !(true) = false
        ^^ ... xor  (true ^^ true) = false  // (true ^^ false) = true

        double novoSalario =  salario*aumento;

        System.out.println("Seu nome salario é de R$"+novoSalario);
        */


/*        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if(idade < 18){
            System.out.println(nome+" é menor de idade");
        }else if(idade>=60){
            System.out.println(nome+" é idoso");
        }else{
            System.out.println(nome+" é maior de idade");
        }*/