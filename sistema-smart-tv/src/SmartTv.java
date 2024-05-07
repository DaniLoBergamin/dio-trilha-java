public class SmartTv{

    // ESTADO INICIAL DA TV QUANDO LIGAR
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // LIGAR E DESLIGAR A TV
    public void ligar(){
        ligada = true;      
    }
    public void desligar(){
        ligada = false;
    }

    // AUMENTAR E DIMINUIR O VOLUME EM +1/-1
    public void aumentarVolume(){
        volume++;           // É a mesma coisa que: volume = volume +1
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;           // É a mesma coisa que: volume = volume -1
        System.out.println("Diminuindo volume para: " + volume);
    }

    // ALTERAR O CANAL
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    // ESCOLHA DO CANAL PELO USUÁRIO
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}