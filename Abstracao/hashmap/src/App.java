import java.util.ArrayList;
import java.util.HashMap;

import modelo.Endereco;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa p = new Pessoa("joao", 10, "email", "94");
        Pessoa p2 = new Pessoa("joao2", 10, "email", "94");

        pessoas.add(p);
        pessoas.add(p2);
        System.out.println(pessoas);

        ArrayList<Integer> numero = new ArrayList<>();
        numero.add(10);
        numero.add(11);

        System.out.println(numero);

        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "joao");
        mapa.put(2, "pedro");
        mapa.put(3, "maria");

        for (int i = 0; i <= 4; i++) {
            System.out.println(mapa.get(i));
        }

        System.out.println("_____");

        HashMap<Integer, String> mapaDefault = new HashMap<>() {
            @Override
            public String get(Object key) {
                if (super.get(key) == null)
                    return "joao";
                return super.get(key);
            }
        };

        mapaDefault.put(3, null);
        
        for (int i = 0; i <= 4; i++) {
            System.out.println(mapaDefault.get(i));
        }

    }
}
