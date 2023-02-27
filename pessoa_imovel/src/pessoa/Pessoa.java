package pessoa;

import imovel.Imovel;

public class Pessoa {

    String nome;
    int idade;
    String fone;

    Imovel enderecoTrabalho;

    public Imovel getEnderecoTrabalho() {
        return enderecoTrabalho;
    }

    public void setEnderecoTrabalho(Imovel enderecoTrabalho) {
        if (enderecoTrabalho.getTipo().equals("RESIDENCIAL")) {
            System.out.println("Tipo inválido para trabalho, pois é residencial");
        } else {
            this.enderecoTrabalho = enderecoTrabalho;
        }
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", fone=" + fone + ", enderecoTrabalho=" + enderecoTrabalho
                + "]";
    }

}
