package desafiopoo3guilhermegomes;

public class Jogador {

    int id;
    String nome;
    int numero;
    int cartoes[] = new int[2];
    int qualidade;
    Boolean situação;
    Boolean participouUltimaPartida;

    public static void situação(Boolean situação) {
        if (situação == true) {
            System.out.println("Jogador está apto para jogar");
        } else {
            System.out.println("Jogador não está apto para jogar");
        }
    }

    public static void aplicarCartao(Boolean situação, int cartaoVermelho, int cartaoAmarelo, String nome, int numero) {
        if (cartaoVermelho >= 1) {
            System.out.println("Jogador " + nome + " numero " + numero + " recebeu " + cartaoVermelho + " cartão(ões) vermelho(s), então está fora do jogo");
            situação = false;
        } else if (cartaoAmarelo >= 3) {
            System.out.println("Jogador " + nome + " numero " + numero + " recebeu " + cartaoAmarelo + " cartões amarelos, então está fora do jogo");
            situação = false;
        } else {
            System.out.println("Jogador " + nome + " numero " + numero + " recebeu " + cartaoAmarelo + " cartão(ões) amarelo(s) e "
                    + cartaoVermelho + " vermelhos então ainda está no jogo");
        }
    }

    public static int[] cumprirSuspensao(int cartoes[], String nome, int numero) {
        if (cartoes[0] > 0 || cartoes[1] > 0) {
            cartoes[0] = 0;
            cartoes[1] = 0;
            System.out.println("Após cumprir suspensão o jogador " + nome + " numero " + numero + " não tem mais cartões");
        }
        return cartoes;

    }

    public static int sofrerLesao(int qualidade, String nome) {

        double val1 = (40 * qualidade) / 100;
        double val2 = (5 * qualidade) / 100;

        final double min = Math.min(val2, val1);
        final double max = Math.max(val2, val1);

        double valor = min + (Math.random() * ((max - min) + 1));

        int result = (int) (qualidade - valor);
        if (result > 0 && result <= 100) {
            System.out.println("O jogador " + nome + " sofreu uma lesão mas ainda está apto para jogar");
            System.out.println("Qualidade :" + result);
        } else {
            System.out.println("O jogador " + nome + " sofreu uma lesão e não está apto para voltar ao jogo");
        }
        return result;

    }

    public static int executarTreinamento(int qualidade, Boolean participouUltimaPartida, String nome) {

        double val1 = (40 * qualidade) / 100;
        double val2 = (5 * qualidade) / 100;

        final double min = Math.min(val2, val1);
        final double max = Math.max(val2, val1);

        double valor = min + (Math.random() * ((max - min) + 1));

        int result = (int) (qualidade + valor);
        if (result > 0 && result <= 100 && participouUltimaPartida == false) {
            System.out.println("O jogador " + nome + " após o treinamento ficou com qualidade =" + result);
        } else {
            System.out.println("Jogador não pode treinar pois precisa descansar");
        }
        return result;

    }
}
