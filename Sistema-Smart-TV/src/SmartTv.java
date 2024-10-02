public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;



    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void trocarCanal(int novoCanal) {
        if (ligada) {
            System.out.println("Trocar canal para "+ novoCanal);
            canal = novoCanal;
        }
        ;
    }

    public void subirCanal(){
        ++canal;
    }
    public void baixarCanal(){
        --canal;
    }

    public void aumentarVolume(){
        ++volume;
    }

    public void baixarVolume(){
        --volume;
    }
}
