package validador;

public class Teste {
    public static int converteParaInteiro(Object x) {
        int retorno = 0;
        try {
            retorno = (int) x;
        } catch (Exception e) {
            System.out.println("Não foi possivel converter o valor pois estava nulo");
        }
        return retorno;
    }

    public static boolean validarString(String valor) {
        String mensagemErro = "Campo de texto é obrigatório possuir no mínimo 2 caracteres.";
        try {

            if (valor.length() < 2) {
                throw new Exception(mensagemErro);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
