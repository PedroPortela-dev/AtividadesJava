import java.util.Scanner;

//Meu nome é Gustavo Maia, tenho 14 anos. Entrei no Sesi esse ano e estou fazendo o itinerário de mecatrônica. Adoro assistir filmes e animes, leio mangá de vez em quando. Obviamente, curto jogar videogame. Programação é uma área que eu quero me aprofundar, pois gosto de lógica, tecnologia e ficar horas sentado na frente do pc quebrando a cabeça por causa de um ";", ou não.

public class HelloGustavoMaia {
    public static void main(String[] args) {
   
     System.out.println("Hello World");
     System.out.println("Vamos fazer um jogo? Você tem que completar a frase seguinte (Escreva com letras minúsculas e sem acentos, pois pode não dar certo :D)");
     System.out.println("Eu pensava que minha vida fosse uma tragédia. Agora me dou conta...");

     Scanner sdc_recebe = new Scanner(System.in);
     String sdc_armazena = sdc_recebe.nextLine();
    
    if (sdc_armazena.equals("que e uma comedia")) {
        System.out.println("Ganhou meu respeito!");
     } else {
        System.out.println("Tente de novo!");
     }
 }
}