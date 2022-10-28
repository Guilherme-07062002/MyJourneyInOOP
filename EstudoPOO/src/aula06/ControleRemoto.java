
package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private Boolean ligado;
    private Boolean tocando;

    public ControleRemoto() {
        
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private Boolean getLigado() {
        return ligado;
    }

    private void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    private Boolean getTocando() {
        return tocando;
    }

    private void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
       this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---MENU---");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume:" + this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println("");
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
           this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void menosVolume() {
         if(this.getLigado() == true){
           this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("A TV está desligada.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
         if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        
    }
    
}
