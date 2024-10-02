public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv =  new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        smartTv.trocarCanal(5);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.baixarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.baixarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.trocarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.subirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        }
}
