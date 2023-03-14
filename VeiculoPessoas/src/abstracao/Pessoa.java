package abstracao;
public class Pessoa {
    
    String nome;

    String telefone;

    Boolean ativo;

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", ativo=" + ativo + "]";
    }

    public Pessoa(String nome, String telefone, Boolean ativo) {
        this.nome = nome;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    

}
