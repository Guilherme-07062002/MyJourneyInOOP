package desafiopoo3guilhermegomes;

public class Main {

    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();
        Jogador j4 = new Jogador();
        Jogador j5 = new Jogador();
        Jogador j6 = new Jogador();
        Jogador j7 = new Jogador();
        Jogador j8 = new Jogador();
        Jogador j9 = new Jogador();
        Jogador j10 = new Jogador();
        Jogador j11 = new Jogador();

        //Instanciando variaveis jogador 1:
        j1.id = 2001;
        j1.nome = "Joao";
        j1.numero = 28;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos.  */
        j1.cartoes[0] = 0;
        j1.cartoes[1] = 3;
        j1.qualidade = 55;
        j1.situação = true;
        j1.participouUltimaPartida = false;
        
        /* Executando metódos para o jogador 1:  
        Eu so coloquei para executar os metodos do jogador j1, apenas para mostrar
        o funcionamento, porém funciona com todos os outros jogadores.*/
        
        Jogador.aplicarCartao(j1.situação, j1.cartoes[0], j1.cartoes[1],j1.nome,j1.numero);
        Jogador.cumprirSuspensao(j1.cartoes,j1.nome,j1.numero);
        Jogador.sofrerLesao(j1.qualidade, j1.nome);
        Jogador.executarTreinamento(j1.qualidade, j1.participouUltimaPartida, j1.nome);
        
        //Instanciando variaveis jogador 2:
        j2.id = 2002;
        j2.nome = "Lucas";
        j2.numero = 13;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j2.cartoes[0] = 0;
        j2.cartoes[1] = 0;
        j2.qualidade = 70;
        j2.situação = true;
        j2.participouUltimaPartida = false;

        //Instanciando variaveis jogador 3:
        j3.id = 2003;
        j3.nome = "Charles";
        j3.numero = 10;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j3.cartoes[0] = 0;
        j3.cartoes[1] = 0;
        j3.qualidade = 60;
        j3.situação = true;
        j3.participouUltimaPartida = false;

        //Instanciando variaveis jogador 4:
        j4.id = 2004;
        j4.nome = "Jadilson";
        j4.numero = 25;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j4.cartoes[0] = 0;
        j4.cartoes[1] = 0;
        j4.qualidade = 45;
        j4.situação = true;
        j4.participouUltimaPartida = false;

        //Instanciando variaveis jogador 5:
        j5.id = 2005;
        j5.nome = "Fernando";
        j5.numero = 28;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j5.cartoes[0] = 0;
        j5.cartoes[1] = 0;
        j5.qualidade = 25;
        j5.situação = true;
        j5.participouUltimaPartida = false;

        //Instanciando variaveis jogador 6:
        j6.id = 2006;
        j6.nome = "Guilherme";
        j6.numero = 30;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j6.cartoes[0] = 0;
        j6.cartoes[1] = 0;
        j6.qualidade = 70;
        j6.situação = true;
        j6.participouUltimaPartida = false;

        //Instanciando variaveis jogador 7:
        j7.id = 2007;
        j7.nome = "Carlos";
        j7.numero = 43;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j7.cartoes[0] = 0;
        j7.cartoes[1] = 0;
        j7.qualidade = 80;
        j7.situação = true;
        j7.participouUltimaPartida = false;

        //Instanciando variaveis jogador 8:
        j8.id = 2008;
        j8.nome = "Thiago";
        j8.numero = 21;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j1.cartoes[0] = 0;
        j1.cartoes[1] = 0;
        j8.qualidade = 90;
        j8.situação = true;
        j8.participouUltimaPartida = false;

        //Instanciando variaveis jogador 9:
        j9.id = 2009;
        j9.nome = "Vinicius";
        j9.numero = 07;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j9.cartoes[0] = 0;
        j9.cartoes[1] = 0;
        j9.qualidade = 50;
        j9.situação = true;
        j9.participouUltimaPartida = false;

        //Instanciando variaveis jogador 10:
        j10.id = 2010;
        j10.nome = "Nicholas";
        j10.numero = 01;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j10.cartoes[0] = 0;
        j10.cartoes[1] = 0;
        j10.qualidade = 60;
        j10.situação = true;
        j10.participouUltimaPartida = false;

        //Instanciando variaveis jogador 11:
        j11.id = 2011;
        j11.nome = "Arthur";
        j11.numero = 03;
        /*O primeiro indice da variavel cartoes [0], são os cartões vermelhos e o segundo indice[1],
        os amarelos*/
        j11.cartoes[0] = 0;
        j11.cartoes[1] = 0;
        j11.qualidade = 30;
        j11.situação = true;
        j11.participouUltimaPartida = false;

    }

}
