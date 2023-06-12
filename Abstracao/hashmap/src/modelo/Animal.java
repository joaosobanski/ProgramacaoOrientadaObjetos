package modelo;

public class Animal {
    String tipo;
    String nome;
    String origem;

    public Animal(String nome, String origem, String tipo) {
        this.nome = nome;
        this.origem = origem;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Animal [tipo=" + tipo + ", nome=" + nome + ", origem=" + origem + "]";
    }

}
