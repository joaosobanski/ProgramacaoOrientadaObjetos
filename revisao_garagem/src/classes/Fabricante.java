package classes;

public class Fabricante {
    String nome;
    String pais;
    String segmento;
    public Fabricante(String nome, String pais, String segmento) {
        this.nome = nome;
        this.pais = pais;
        this.segmento = segmento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getSegmento() {
        return segmento;
    }
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
    @Override
    public String toString() {
        return "Fabricante [nome=" + nome + ", pais=" + pais + ", segmento=" + segmento + "]";
    }
    
}
