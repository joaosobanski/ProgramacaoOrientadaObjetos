package modelo;

import enumCategoria.Categoria;

public class Animal {
    String tipo;
    String nome;
    String origem;
    Categoria categoria;

    public Animal(String nome, String origem, Categoria categoria, String tipo) {
        this.nome = nome;
        this.origem = origem;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", origem=" + origem + ", Categoria=" + categoria + ", tipo=" + tipo + "]";
    }

}
