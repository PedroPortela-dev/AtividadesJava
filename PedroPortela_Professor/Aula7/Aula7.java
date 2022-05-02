import java.util.Scanner;

/**
 * Aula7
 */
public class Aula7 {

    public static void main(String[] args) {

        double altura = receberValor("altura");

        double base = receberValor("base");

        double area = base*altura;
        double perimetro = 2*(base+altura);

        print("area", area);
        print("perimetro", perimetro);
    }

    static double receberValor(String txt){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a "+txt+": ");
        return input.nextDouble();
        
    }

    static void print(String txt, double num){
        System.out.println("A "+txt+" é "+num);
    }
}