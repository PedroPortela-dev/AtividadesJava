public class ex003 
{
    public static void main (String[] args) 
    {
        int a = 8;
        int b = 3;

        System.out.println("A variável a é: " + a); 
        System.out.println("A variável b é: " + b);

        if (a > b) 
        {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        System.out.println("Agora a = " + a); 
        System.out.println("Agora b = " + b);
    }
}

//