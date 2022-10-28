
package aula09;

public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

   
    public String detalhes() {
        return "Livro: \n" + " titulo=" + titulo + ",\n autor=" + autor 
                + ",\n totPaginas=" + totPaginas + ",\n pagAtual=" + pagAtual 
                + ",\n aberto=" + aberto + ",\n leitor=" +leitor.getNome()+
                ",\n idade=" + leitor.getIdade() + ",\n sexo=" +leitor.getSexo();
    }
    
    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual =0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            System.out.println("Não existe essa pagina");
        }
        this.pagAtual = p;
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
