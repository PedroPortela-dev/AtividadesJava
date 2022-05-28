import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException{
        
        Scanner input =  new Scanner(System.in);

        String email;
        int senha;
        String nome;
        String usuario;
        int idade;
        int i = 0, j = 0;

        System.out.println("qq coisa");
        int pular = input.nextInt();

        Usuario users[] =  new Usuario[20];

        do {
            
            System.out.println("Para criar [1]");
            System.out.println("Para ler [2]");
            System.out.println("Para atualizar [3]");
            System.out.println("Para excluir [4]");
            System.out.println("Proximo usuario [5]");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    
                    users[i].Criar();
                    i++;
                    break;

                case 2:

                    users[j].Ler();
                    break;

                case 3:

                    users[j].Atualizar();
                    break;

                case 4:

                    i--;
                    for (int k = j; k < i; k++) {
                        users[k] = users[k+1];
                    }
                    break;

                case 5:
                    
                    if(j<i-1){
                        j++;
                    }else{
                        j = 0;
                    }
                    break;
            
                default:
                    break;
            }
        } while (true);
    }
}