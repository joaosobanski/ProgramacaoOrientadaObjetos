package modelo;

import enums.Categoria;
import enums.SistemaRespiratorio;

public abstract class Animal {
    String especie;
    String origem;
    Categoria categoria;
    String nome;
    SistemaRespiratorio respiratorio;
    
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public SistemaRespiratorio getRespiratorio() {
        return respiratorio;
    }
    public void setRespiratorio(SistemaRespiratorio respiratorio) {
        this.respiratorio = respiratorio;
    }
    

}
