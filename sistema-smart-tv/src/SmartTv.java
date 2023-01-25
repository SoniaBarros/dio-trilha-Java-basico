// vamos criar um exemplo de uma classe para representar uma SmarTv onde tenha as caratcterisitca: ligada (boolean) , canal (int) e volume (int)
//Nossa tv podera ligar e desligar a assim mudar o status ligada
//nossa tv aumentara e diminuira o volume sempre +1 ou -1
//Nossa tv podera mudar o canal de 1 em 1 ou definindo o numero correspondente. 

public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

public void mudarCanal (int novoCanal){
    canal = novoCanal;
}
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume() {
        //volume = volume + 1;
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume() {
        //volume = volume - 1;
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void ligar(){
        ligada = true;
    }
    public void  desligar(){
        ligada = false;
    }

}