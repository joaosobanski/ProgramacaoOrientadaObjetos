package model.pessoa;

public class PessoaJuridica extends Pessoa {
    String cnpj;

    // definição de polimorfismo é possuir mais de uma função com nomes iguais porem
    // parametros diferentes
    public PessoaJuridica() {

    }

    public PessoaJuridica(String nome, int idade, String cnpj, String email) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
    }

}
