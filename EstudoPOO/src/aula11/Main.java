
package aula11;

public class Main {
    public static void main(String[] args) {
        
    
    Visitante v1 = new Visitante();
    Aluno a1 = new Aluno();
    Bolsista b1 = new Bolsista();
    
    
    /*v1.setNome("Juvenal");
    v1.setIdade(22);
    v1.setSexo("M");
    
        System.out.println(v1.toString());
  */
    a1.setNome("Juvenal");
    a1.setIdade(20);
    a1.setSexo("M");
    a1.setCurso("Informatica");
    a1.setMatricula(2001);
    a1.pagarMensalidade();
    
    b1.setNome("Jose");
    b1.setIdade(20);
    b1.setSexo("M");
    b1.setCurso("Informatica");
    b1.setMatricula(2002);
    b1.pagarMensalidade();
}
   
}
