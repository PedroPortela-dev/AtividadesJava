import java.util.Scanner;

/**
 * Aula6
 */
public class Aula6 {

    double area;
    public static void main(String[] args) {

        double altura = pedirValor("Altura");

        double base = pedirValor("Base");

        area = altura*base;

        retangulo(area);

        System.out.println("A area do Retangulo é: "+ area);

        double perimetro = 2*(altura+base);

    }

    static void retangulo(double a){
        a = 10;
    }

    static double pedirValor(String dimensao){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a "+dimensao+": ");

        return input.nextDouble();
    }
}