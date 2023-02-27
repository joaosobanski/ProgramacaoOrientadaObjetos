package imovel;

public class Imovel {
    String endereco;
    int cep;
    int numero;

    public Imovel(String endereco, int cep, int numero) {
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
