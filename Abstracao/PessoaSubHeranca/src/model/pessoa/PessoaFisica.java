package model.pessoa;

public class PessoaFisica extends Pessoa {
    String cpf;
    String cnh;
    String rg;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, int idade, String cpf, String rg, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", idade=" + idade + ", email=" + email
                + "]";
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

}
