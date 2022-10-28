package Questão4;

public class Interrogatorio {

    String resposta[] = new String[5];

    public static String interrogatorio(String resposta[]) {
        int soma = 0;
        String res = null;

        for (String retorno : resposta) {
            if ("sim".equals(retorno)) {
                soma = soma + 1;
            } else {
                soma = soma + 0;
            }
        }
        switch (soma) {
            case 2:
                res = "Suspeito";
                break;
            case 3:
            case 4:
                res = "Cumplice";
                break;
            case 5:
                res = "Assassino";
                break;

            default:
                res = "Inocente";
                break;
        }

        return res;
    }
}
