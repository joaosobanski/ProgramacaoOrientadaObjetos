
import java.util.ArrayList;
import java.util.List;

import enumCategoria.Categoria;
import modelo.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Categoria aquatico = Categoria.AQUATICO;

        System.out.println(aquatico);

        List<Animal> lista = new ArrayList<>();

        Animal salmao = new Animal("Bob", "Noruega", Categoria.AQUATICO, "salmao");
        lista.add(salmao);

        Animal tubarao = new Animal("Jorge", "do mundo", Categoria.AQUATICO, "tubarao");
        lista.add(tubarao);

        Animal gira = new Animal("Richardizinhu", "Africa", Categoria.TERRESTRE, "girafa");
        lista.add(gira);

        System.out.println(lista);

        List<Animal> aquaticos = new ArrayList<>();

        for (Animal animal : lista) {
            System.out.println(animal.getCategoria());
            if(animal.getCategoria() == Categoria.AQUATICO){
                aquaticos.add(animal);
            }
        }

        System.out.println(aquaticos);

    }
}
