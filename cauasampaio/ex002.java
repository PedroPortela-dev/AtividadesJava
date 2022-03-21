import java.util.Scanner;

public class ex002 
{
    public static void main (String[] args)
    {

        System.out.println("Operadores");
        operadores();
        System.out.println("Aritmetico");
        aritmetico();
    }


private static void operadores()
{
    try (Scanner input = new Scanner (System.in)) {
        byte b1 = 10;
        byte b2 = 20; 

        short s1 = 20000;
        short s2 = 21023;

        long l1 = 110231203120301123L;
        long l2 = 210203102030123010L;

        float f1 = 4.5f;
        float f2 = 10.6839f;

        double d1 = 85.69;
        double d2 = 22.30;

        char c1 = 'B';
        char c2 = 'T';
        char c3 = '\u0057';

        boolean bol1= true; 
        boolean bol2= false;



        String st1 = "texto  aleatório";
        String st2 = "L, você sabia ? Shinigamis só comem maçãs";

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(bol1);
        System.out.println(bol2);

        System.out.println(st1);
        System.out.println(st2);

        System.out.print("Digite seu nome:  ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade:  ");
        String idade = input.nextLine();
        System.out.println(nome + " Você é lindo");
    }

}


private static void aritmetico()
{

    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    int e = 50;

    int r1 = a + b;
    int r2 = c - a;
    int r3 = d * b;
    int r4 = e / a;
    int r5 = c % b;

    System.out.println("a+b = " + r1);
    System.out.println("c-a = " + r2);
    System.out.println("d*b = " + r3);
    System.out.println("e/a = " + r4);
    System.out.println("c%b = " + r5);
        

}
}




