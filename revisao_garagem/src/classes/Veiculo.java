package classes;

public class Veiculo {
    String nome;
    String placa;
    String cor;
    int ano;
    Fabricante fabricante;
    Pessoa pessoa;

    
    public Veiculo(String nome, String placa, String cor, int ano, Fabricante fabricante) {
        this.nome = nome;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.fabricante = fabricante;
    }
    public Veiculo(String nome, String placa, String cor, int ano, Fabricante fabricante , Pessoa p) {
        this.nome = nome;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.fabricante = fabricante;
        this.pessoa = p;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", placa=" + placa + ", cor=" + cor + ", ano=" + ano + ", fabricante="
                + fabricante + ", pessoa=" + pessoa + "]";
    } 



}
