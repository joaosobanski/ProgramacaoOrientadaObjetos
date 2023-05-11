package model.pessoa;

public class Fornecedor extends PessoaJuridica {

    public Fornecedor(String nome, int idade, String cnpj, String email) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
    }
}
