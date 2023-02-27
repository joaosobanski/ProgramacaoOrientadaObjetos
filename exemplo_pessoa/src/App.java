import java.util.ArrayList;

import pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa = new Pessoa("Maria", 15);
        pessoas.add(pessoa);

        Pessoa pessoa2 = new Pessoa("Miguel", 5);
        pessoas.add(pessoa2);

        Pessoa pessoa3 = new Pessoa("Ana", 20);
        pessoas.add(pessoa3);

        System.out.println(pessoas);
        // pessoa.
    }
}
