public class Televisao {
    
    private int canal;
    private int volume;
    private boolean ligada;
    private final int comprimento = 12;
    private final int largura = 8;

    Televisao(){

        volume = 50;
        canal = 30;
    }

    int getCanal(){
        return canal;
    }

    int getVolume(){
        return volume;
    }

    int getComprimento(){
        return comprimento;
    }

    int getLargura(){
        return largura;
    }

    void AumentarCanal(int aumento){

        if(ligada){
            for (int i = 0; i < aumento; i++) {
                canal++;
            }
        }
    }

    void DiminuirCanal(){

        if(ligada){
            canal--;
        }
    }

    void ligarTV(){

        ligada = !ligada;
    }

    void AumentarVolume(int aumento){

        if(ligada){
            volume += aumento;
        }
        
    }

    void DiminuirDiminuir(){

        if(ligada){
            volume--;
        }
        
    } 
}
