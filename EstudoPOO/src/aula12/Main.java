package aula12;

public class Main {

    public static void main(String[] args) {
      /*  Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Reptil r = new Reptil();
        Canguru c = new Canguru();
        
        m.locomover();
        p.emitirSom();
        c.locomover();
*/
      Cachorro c = new Cachorro();
      
      c.reagir(true);
      c.reagir("ola");
      c.reagir(5, 10);
      c.reagir(18, 30);

    }

}
