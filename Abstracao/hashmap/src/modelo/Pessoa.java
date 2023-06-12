package modelo;

public class Pessoa {
    String nome;
    int idade;
    String email;
    String fone;

    public Pessoa(String nome, int idade, String email, String fone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{nome=" + nome + ", idade=" + idade + ", email=" + email + "}";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

}
