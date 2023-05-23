package modelo;

import enums.Categoria;
import enums.SistemaRespiratorio;

public class Terrestre extends Animal {
    int patas;
    
    public Terrestre(String especie, String origem, String nome, SistemaRespiratorio respiratorio, int patas) {
        this.especie = especie;
        this.origem = origem;
        this.categoria = Categoria.TERRESTRE;
        this.nome = nome;
        this.respiratorio = respiratorio;
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Animal [especie=" + especie + ", origem=" + origem + ", categoria=" + categoria.getTipo() + ", nome=" + nome
                + ", respiratorio=" + respiratorio.getTipo() +  ", patas=" + patas + "]";
    }
    
}
