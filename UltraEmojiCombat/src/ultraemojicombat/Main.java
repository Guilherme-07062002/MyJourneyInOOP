package ultraemojicombat;

public class Main {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Gut atorment", "Brasileiro", 18, 1.70f, 54.5f, 3, 4, 2);

        l[0].status();

        l[1] = new Lutador("Den spelm", "Brasileiro", 18, 2.00f, 54.5f, 6, 2, 1);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
        
    }
}
