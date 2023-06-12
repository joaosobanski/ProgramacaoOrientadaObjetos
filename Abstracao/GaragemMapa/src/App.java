import modelo.Garagem;
import modelo.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

        Veiculo gol = new Veiculo(1994, "Gol GTI 2000");
        Veiculo gol2 = new Veiculo(1998, "Gol GTI 2000");
        Veiculo gol3 = new Veiculo(1999, "Gol TURBO 1000");

        Garagem g = new Garagem(2);

        g.estacionar(gol);
        g.estacionar(gol2);
        // g.retirar(0);
        g.estacionar(gol3);

        System.out.println(g);

        System.out.println(g.filtro("GTI"));

    }
}
