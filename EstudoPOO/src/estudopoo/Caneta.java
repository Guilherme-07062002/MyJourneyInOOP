
package estudopoo;

public class Caneta {

   public String modelo;
   private float ponta;
   private  String cor;
   private Boolean tampada;

    public Caneta(String m,String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
       
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
   
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Cor : "+ this.cor);
        System.out.println("Tampada: "+ this.tampada);
    }
   
   
    
}
