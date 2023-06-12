package modelo;

public class PessoaValidator {

    public static boolean ValidarPessoa(String nome, String email) {
        try {
            if (nome.length() < 2)
                throw new Exception(" Nome Deve Possuir 2 caracteres no mínimo");

            if (email.length() < 2)
                throw new Exception(" Email Deve Possuir 2 caracteres no mínimo");

            if (!email.contains("@"))
                throw new Exception(" Email Deve Possuir @");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
