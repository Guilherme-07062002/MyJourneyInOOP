
package aula09;

public class Main {
    public static void main(String[] args) {
        
    
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[4];
    
    p[0]= new Pessoa("João",18,"M");
    p[1]=new Pessoa("Maria",20,"F");
    
    l[0] = new Livro("Naruto","Jubileu",200,p[0]);
    
    l[0].abrir();
    l[0].folhear(200);
        System.out.println(l[0].detalhes());
}
}