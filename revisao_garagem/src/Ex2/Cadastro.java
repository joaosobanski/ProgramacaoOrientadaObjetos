package Ex2;

import java.util.ArrayList;

import classes.Pessoa;

public class Cadastro {
    
    ArrayList<Pessoa> bebes = new ArrayList<>();
    ArrayList<Pessoa> criancas = new ArrayList<>();
    ArrayList<Pessoa> adolecente = new ArrayList<>();
    ArrayList<Pessoa> adultos = new ArrayList<>();
    ArrayList<Pessoa> idososs = new ArrayList<>();

    public void adicionar(Pessoa p){
        if(p.getIdade() < 0){
            System.out.println("nao nasceu");
        } else if( p.getIdade() < 3){
            bebes.add(p);
        } else if(p.getIdade() < 10){
            criancas.add(p);
        } else if(p.getIdade() < 20){
            adolecente.add(p);
        } else if(p.getIdade() < 65){
            adultos.add(p);
        } else {
            idososs.add(p);
        }
    }

    @Override
    public String toString() {
        return "Cadastro [bebes=" + bebes + ", criancas=" + criancas + ", adolecente=" + adolecente + ", adultos="
                + adultos + ", idososs=" + idososs + "]";
    }

    
}
