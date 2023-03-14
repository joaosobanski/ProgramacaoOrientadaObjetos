import java.util.ArrayList;

import abstracao.Pessoa;
import abstracao.Veiculo;

public class App {
    /*
        Criar um aplicativo para controlar as posições dentro de um veiculo
        uma classe Pessoa
        a classe veiculo precisa ter uma lista de posições
        0 sempre é o motorista
    */


    public static void main(String[] args) throws Exception {
        // cria um vetor de 5 posições sendo que a posicao ja recebe o seu valor
        // int[] i = {4,3,2,1,0};

        // cria um vetor de 5 posições porem todas vazias
        // int[] t = new int[5];
        // System.out.println(t.length);
        // System.out.println(t[2]);

        // System.out.println(i.length);

        // ArrayList<String> nomes = new ArrayList<>();

        // System.out.println(nomes.size());

        // nomes.add("joao");

        // System.out.println(nomes.size());
        // nomes.add("pedro");

        // System.out.println(nomes.size());
        
        
        // System.out.println(nomes.get(0));

        // nomes.remove(0);

        // System.out.println(nomes.get(0));

        // nomes.add("maria");

        // System.out.println(nomes.size());

        // nomes.set(0, "Joao");

        // System.out.println(nomes);

        

        // System.out.println(i[1]);
        // i[1] = 20;
        // System.out.println(i[1]);


        // linhas 60 61 62 instancia a classe pessoa informando por parametro seus atributos
        Pessoa p = new Pessoa("joao", "111111");
        Pessoa o = new Pessoa("maria","1827321767");
        Pessoa pedro = new Pessoa("pedro","12937928");


        // instancia a classe Veiculo informando por parametro seus atributos
        // p é uma pessoa, no caso o motorista como está dentro do construtor
        Veiculo v = new Veiculo(p, "moto", 2);
        
        System.out.println(v.getMotorista());
        
        // consome  a funcção que retorna as posições disponiveis 
        System.out.println(v.posicoesDisponiveis());
        v.embarcar(p);
        v.embarcar(o);
        v.embarcar(pedro);

        System.out.println(v.posicoesDisponiveis());
        

        v.desembarcar(o);

        System.out.println();
        System.out.println(v.passageirosEmbarcados());

        // System.out.println(p.getNome());
        // System.out.println(p.getAtivo());


        // System.out.println(o.getNome());
        // System.out.println(o.getAtivo());



    }
}
