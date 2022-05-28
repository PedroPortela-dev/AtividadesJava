import java.util.Scanner;

public class Usuario {
    
    private String email;
    private int senha;
    private String nome;
    private String usuario;
    private int idade;

    void Criar(){

        Scanner input = new Scanner(System.in);

        String email;
        int senha;
        String nome;
         String usuario;
         int idade;

        System.out.print("Digite seu email: ");
        email = input.next();
        System.out.println("Digite sua senha: ");
        senha = input.nextInt();
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite nome do usuario: ");
        usuario = input.next();
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.usuario = usuario;
        this.idade = idade;
    }

    void Ler(){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        int senha = input.nextInt();
        int contador = 0;
        do{
            if(senha == this.senha){

                System.out.println("email: " + email);
                System.out.println("senha: "+this.senha);
                System.out.println("nome: "+nome);
                System.out.println("usuario: "+usuario);
                System.out.println("idade: "+idade);
            }else{
                System.out.println("Senha incorreta");
                contador++;
            }
        }while(senha != this.senha && contador<2);
        
    }

    void Atualizar(){

        Scanner input = new Scanner(System.in);

        String email;
        int senha;
        String nome;
         String usuario;
         int idade;

        System.out.print("Digite seu email: ");
        email = input.next();
        System.out.println("Digite sua senha: ");
        senha = input.nextInt();
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite nome do usuario: ");
        usuario = input.next();
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        System.out.print("Digite sua senha: ");
        int senha2 = input.nextInt();
        int contador = 0;
        do{
            if(senha2 == this.senha){

                this.email = email;
                this.senha = senha;
                this.nome = nome;
                this.usuario = usuario;
                this.idade = idade;
            }else{
                System.out.println("Senha incorreta");
                contador++;
            }
        }while(senha2 != this.senha && contador<2);
    }
}
