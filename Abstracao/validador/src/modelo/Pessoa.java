package modelo;

public class Pessoa {
    String nome;
    String email;

    public Pessoa(String nome, String email) {
        try {
            if (nome == null || nome.length() < 2)
                throw new Exception("Nome deve possuir 2 caracteres no mínimo!");
            if (email == null || email.length() < 2)
                throw new Exception("Email deve possuir 2 caracteres no mínimo!");
            if (!email.contains("@"))
                throw new Exception("Deve possuir @!");

            this.nome = nome;
            this.email = email;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", email=" + email + "]";
    }

}
