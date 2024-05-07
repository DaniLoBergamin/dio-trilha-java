public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // MÉTODO LIGAR E DESLIGAR A TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    
        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    
        // MÉTODO VOLUME +1/-1
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        // OUTPUT = Volume: 23
        System.out.println("Volume atual: " + smartTv.volume);
    
        // MÉTODO DE ESCOLHA DO CANAL PELO USUÁRIO
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
