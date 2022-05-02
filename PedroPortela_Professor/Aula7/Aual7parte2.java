import java.util.Scanner;

public class Aual7parte2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = input.nextInt();

        System.out.println("o somatorio de "+num+" é "+fatorial(num));
        
    }

    static int fatorial(int n){

        if(n == 1){
            return 1;
        }

        return n+fatorial(n-1);
    }
}
