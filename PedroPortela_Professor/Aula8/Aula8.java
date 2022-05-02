import java.lang.Math;

/**
 * Aula8
 */
public class Aula8 {

    public static void main(String[] args) {
        
        Televisao minhaTv = new Televisao();
        Televisao alunosTv = new Televisao();

        minhaTv.ligarTV();

        
        minhaTv.AumentarCanal(40);
        minhaTv.AumentarVolume(10);

        System.out.println("canal da minha telivisao: "+minhaTv.getCanal());
        System.out.println("volume da minha telivisao: "+minhaTv.getVolume());
        System.out.println("canal da alunos telivisao: "+alunosTv.getCanal());
        System.out.println("volume da alunos telivisao: "+alunosTv.getVolume());

    }
}