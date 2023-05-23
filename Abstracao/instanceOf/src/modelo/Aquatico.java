package modelo;

import enums.Categoria;
import enums.SistemaRespiratorio;

public class Aquatico extends Animal {
    int nadadeiras;
    
    public Aquatico(String especie, String origem, String nome, SistemaRespiratorio respiratorio, int nadadeiras) {
        this.especie = especie;
        this.origem = origem;
        this.categoria = Categoria.AQUATICO;
        this.nome = nome;
        this.respiratorio = respiratorio;
        this.nadadeiras = nadadeiras;
    }

    @Override
    public String toString() {
        return "Animal [especie=" + especie + ", origem=" + origem + ", categoria=" + categoria.getTipo() + ", nome=" + nome
                + ", respiratorio=" + respiratorio.getTipo() +  ", nadadeiras=" + nadadeiras + "]";
    }
    
}
