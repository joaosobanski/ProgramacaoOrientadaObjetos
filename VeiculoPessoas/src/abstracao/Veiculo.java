package abstracao;

import java.util.ArrayList;
import java.util.Arrays;

public class Veiculo {

    String nome;

    int numeroPassageiro;

    Pessoa motorista;

    Pessoa[] passageiros;

    private boolean contains(Pessoa pessoa){
        for(Pessoa p : passageiros){
            if(p == pessoa){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Pessoa> passageirosEmbarcados(){
        ArrayList<Pessoa> retorno = new ArrayList<>();
        //percorre os passageiros que nao estao null
        for(Pessoa p: passageiros){
            if(p != null){
                retorno.add(p);
            }
        }

        if(retorno.size() == 0){
            System.out.println("Não existe passageiro embarcado!");
        }

        return retorno;
    }

    public ArrayList<Integer> posicoesDisponiveis(){
        // arraylist é uma lista dinamica nao possui tamanho fixo
        ArrayList<Integer> retorno = new ArrayList<>();
        for(int indice=0 ; indice < passageiros.length ; indice++){
            if(passageiros[indice] == null)
            // adiciona o inteiro do indice na lista retorno
                retorno.add(indice);
        }
        if(retorno.size() == 0){
            System.out.println("Veiculo está cheio");
        }
        return retorno;
    }

    public void embarcar(Pessoa pessoa){
        // verifica se a pessoa é o motora
        if(pessoa == motorista){
            System.out.println("Motorista "+ motorista.nome +" já está no veiculo!");
        }else{ 
            // contains verifica se a pessoa está na lista de passgeiros  
            if(!contains(pessoa)){ 
                for(int indice=0 ; indice< passageiros.length ; indice++){
                    if(passageiros[indice] == null){
                        // se encontarr uma vaga disponivel irá ocupar
                        passageiros[indice] = pessoa;
                        break;
                    }
                }
                // verifica se a pessoa realmente esta no veiculo ou ocupou a vaga
                if(contains(pessoa)){
                    System.out.println("Passageiro "+pessoa.nome + " embarcou!");
                }else{
                    System.out.println("Passageiro "+pessoa.nome + " não embarcou pois o veiculo esta cheio!");
                }
            }else{
                System.out.println("Passageiro "+pessoa.nome + " já está no veiculo!");
            }
        }
    }

    public Pessoa desembarcar(Pessoa pessoa){
        // percorre as pessoas embarcadas
        for(int indice=0 ; indice < passageiros.length ; indice++){
            if(passageiros[indice] == pessoa){
               // define a vaga como disponivel pois irá sair
                passageiros[indice] = null;
                return pessoa;
            }
        }
        System.out.println("A pessoa "+ pessoa.nome + " não está no veiculo!");
        return null;
    }

// construtor
    public Veiculo(Pessoa motorista, String nome, int numeroPassageiro) {
        this.motorista = motorista;
        this.nome = nome;
        this.numeroPassageiro = numeroPassageiro;
        // definição do tamanho do vetor passageiros 
        // vagas disponiveis no veiculo
        this.passageiros = new Pessoa[numeroPassageiro];
    }


    //to string é uma função para exibir os dados do objeto em um console. 
   // como será usado quando chamar o metodo getMotorista que está abaixo linha 102 
    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", numeroPassageiro=" + numeroPassageiro + ", motorista=" + motorista
                + ", passageiros=" + Arrays.toString(passageiros) + "]";
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPassageiro() {
        return numeroPassageiro;
    }

    public void setNumeroPassageiro(int numeroPassageiro) {
        this.numeroPassageiro = numeroPassageiro;
    }

    public Pessoa[] getPassageiro() {
        return passageiros;
    }

    public void setPassageiro(Pessoa[] passageiro) {
        this.passageiros = passageiro;
    }
    


}
