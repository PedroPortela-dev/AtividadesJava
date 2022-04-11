public class ex005 
{
    public static void main (String[] args) 
    {
        int n1 = 1;
        int n2 = 0;
        int aux;

        for (int i = 0; i < 5; i++)
        {
            System.out.println(n1);
            aux = n1; 
            n1 = n1 + n2;
            n2 = aux;  

        }
    } 

}