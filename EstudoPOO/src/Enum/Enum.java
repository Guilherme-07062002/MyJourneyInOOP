
package Enum;

public class Enum {
      public static void main(String[] args) {
        Curso curso = new Curso();
        Turno turno = Turno.MANHA;
        curso.setNome("Informatica");
        curso.setHoras(360);
        curso.setTurno(Turno.TARDE);
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Horas: " + curso.getHoras());
        System.out.println("Turno: " + turno.getDescricao());
    }

    public enum Turno {
        MANHA("Manha"),
        TARDE("Tarde"),
        NOITE("Noite");

        String descricao;

        private Turno(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

    }

    public static class Curso {
        //Curso

        private String nome;
        private int horas;
        private Turno turno;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getHoras() {
            return horas;
        }

        public void setHoras(int horas) {
            this.horas = horas;
        }

        public Turno getTurno() {
            return turno;
        }

        public void setTurno(Turno turno) {
            this.turno = turno;
        }

    }

}
