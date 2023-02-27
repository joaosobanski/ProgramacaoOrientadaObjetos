package imovel;

public class Imovel {
    String endereco;
    int cep;
    int numero;
    String tipo;

    public Imovel(String endereco, int cep, int numero, String tipo) {
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Imovel [endereco=" + endereco + ", cep=" + cep + ", numero=" + numero + ", tipo=" + tipo + "]";
    }

}
