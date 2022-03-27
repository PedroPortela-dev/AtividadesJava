public class ex005 
{
    public static void main (String[] args) 
    {
        int n1 = 1;
        int n2 = 0;
        int aux;

        for (int i = 0; i < 30; i++) // laço, e limita o código aos primeiros 30 valores da sequencia de fibonacci.
        {
            System.out.println(n1); 
            // imprime o valor de n1
            aux = n1; 
            // variavel auxiliar ("aux") recebe 1 (valor inicial da variável n1).
            n1 = n1 + n2; 
            // n1 (que vai ser impresso) é o valor de n1 + n2, nesse caso o valor 0 não vai aparecer, já que só a soma é impressa, e a primeira soma é 1 + 0.
            n2 = aux;  
            // a variavel n2 recebe o valor da soma
        }
    } 

}