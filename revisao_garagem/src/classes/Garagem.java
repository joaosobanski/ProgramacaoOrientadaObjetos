package classes;

import java.util.ArrayList;

public class Garagem {
    int vagas;
    Veiculo[] veiculos;
    public int getVagas() {
        return vagas;
    }
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
    public Veiculo[] getVeiculos() {
        return veiculos;
    }
    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }
    public Garagem(int vagas) {
        this.vagas = vagas;
        this.veiculos = new Veiculo[vagas];
    }

    public void estacionar(Veiculo v){
        for(int i =0 ; i< veiculos.length ; i++){
            System.out.println(veiculos[i] + " " + i);
            if(veiculos[i] == null){
                veiculos[i] = v;
                System.out.println("Veiculo estacionou na vaga " + i);
                break;
            }
        }
    }
    public void verificaVaga(int vaga){
        if(vaga > vagas){
            System.out.println("Vaga não encontrada!");
        }else{
            Veiculo v = veiculos[vaga];
            if(v ==null)
                System.out.println("Vaga "+ vaga + " está disponível!");
            else
                System.out.println(v);
        }

    }

    public void vagasDisponiveis(){
        int vagasDisponiveis = 0;
        for(int i =0 ; i< veiculos.length ; i++){
            if(veiculos[i] == null){
                vagasDisponiveis++;
            }
        }
        if(vagasDisponiveis == 0){
            System.out.println("Garagem está cheia!");
        }else{
            System.out.println("Vagas disponíveis : "+vagasDisponiveis);
        }
    }
    public void vagasOcupadas(){
        int vagasOcupadas = 0;
        for(int i =0 ; i< veiculos.length ; i++){
            if(veiculos[i] != null){
                vagasOcupadas++;
            }
        }
        if(vagasOcupadas == 0 ){
            System.out.println("Todas vagas estão disponíveis");
        } else
        if(vagasOcupadas == vagas){
            System.out.println("Garagem está cheia, possui " + vagasOcupadas + " Veiculos");
        }else{
            System.out.println("Vagas ocupadas : "+vagasOcupadas);
        }
    }

    public void listarVeiculosDaGaragem(){
        ArrayList<Veiculo> veiculosGaragem = new ArrayList<>();
        for(int i =0 ; i< veiculos.length ; i++){
            if(veiculos[i] != null){
                veiculosGaragem.add(veiculos[i]);
            }
        }
        System.out.println(veiculosGaragem);
    }

    

}
