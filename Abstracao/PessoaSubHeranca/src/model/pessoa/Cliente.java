package model.pessoa;

public class Cliente extends PessoaFisica {
    String enderecoCobranca;

    public Cliente(String nome, int idade, String cpf, String rg, String email, String enderecoCobranca) {
        // super é usado quando precisa instanciar uma classe chamando seu construtor
        // principal
        super(nome, idade, cpf, rg, email);
        this.enderecoCobranca = enderecoCobranca;
    }

    public void validarCPF() {
        if (cpf.equals("") && cpf == null) {
            // da erro
        }
    }

    public void validarNome() {
        if (nome.equals("") && nome == null) {
            // da erro
        }
    }

    public void validarCNH() {
        if (idade > 18)
            if (cnh.equals("") && cnh == null) {
                // da erro
            }
    }

    public boolean validarDados() {

        validarCPF();

        validarNome();

        validarCNH();

        return true;
    }

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", idade=" + idade + ", email=" + email +
                ", enderecoCobranca=" + enderecoCobranca + "]";
    }

    public String getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(String enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }
}
