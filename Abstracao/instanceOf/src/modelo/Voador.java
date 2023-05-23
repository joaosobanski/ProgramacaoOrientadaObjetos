package modelo;

import enums.Categoria;
import enums.SistemaRespiratorio;

public class Voador extends Animal {
    int asas;
    
    public Voador(String especie, String origem, String nome, SistemaRespiratorio respiratorio, int asas) {
        this.especie = especie;
        this.origem = origem;
        this.categoria = Categoria.VOADOR;
        this.nome = nome;
        this.respiratorio = respiratorio;
        this.asas = asas;
    }

    @Override
    public String toString() {
        return "Animal [especie=" + especie + ", origem=" + origem + ", categoria=" + categoria + ", nome=" + nome
                + ", respiratorio=" + respiratorio.getTipo() +  ", asas=" + asas + "]";
    }
    
}
