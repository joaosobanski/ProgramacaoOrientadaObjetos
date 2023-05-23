import java.util.ArrayList;
import java.util.List;

import enums.Categoria;
import enums.SistemaRespiratorio;
import modelo.Aquatico;
import modelo.Terrestre;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Categoria[] cat = new Categoria[2];
        cat[0] = Categoria.AQUATICO;
        cat[1] = Categoria.TERRESTRE;

        Aquatico salmao = new Aquatico("salmao", "Argentina", "Bob", SistemaRespiratorio.BRANQUIA, 4);

        System.out.println(salmao);

        Terrestre girafa = new Terrestre("Girafa", "Africa", "Richard", SistemaRespiratorio.PUMONAR, 4);

        System.out.println(girafa);

        // instancia um Object com o valor da variavel girafa que é uma instancia
        // Terrestre
        Object x = girafa;

        System.out.println(x);
        System.out.println(x.getClass());

        // instanceof faz a comparação entre o objeto que está no obj e compara se tipo
        // é igual a Terrestre
        if (x instanceof Terrestre) {
            System.out.println("é terrestre");
        }
        if (x instanceof Integer) {
            System.out.println("é um número");
        }

        // crio uma lista genérica de Objetos
        List<Object> lista = new ArrayList<>();

        // adiciono valores
        lista.add(salmao);
        lista.add(girafa);
        lista.add(10);

        System.out.println(lista);

        List<Terrestre> terrestres = new ArrayList<>();
        List<Aquatico> aquaticos = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        for (Object obj : lista) {
            // instanceof faz a comparação entre o objeto que está no obj e compara se tipo
            // é igual a Terrestre
            if (obj instanceof Terrestre) {
                // conversão de Object para Terrestre
                Terrestre var = (Terrestre) obj;
                terrestres.add(var);
            } else if (obj instanceof Aquatico) {
                // conversão de Object para Aquatico
                Aquatico var = (Aquatico) obj;
                aquaticos.add(var);
            } else if (obj instanceof Integer) {
                int var = (Integer) obj;
                numeros.add(var);
            }
        }
        
        System.out.println();

        System.out.println(terrestres);
        System.out.println(aquaticos);
        System.out.println(numeros);

    }
}
