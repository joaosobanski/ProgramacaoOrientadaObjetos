package Ex3;

import classes.Fabricante;
import classes.Veiculo;

public class Ex3 {
    public static void main(String[] args) {
        Fabricante f = new Fabricante("volks", "alemanha", "Veiculos");
        Veiculo v = new Veiculo("fusca", "AI-123", "azul", 1963, f);

        System.out.println(f);
        System.out.println(v);


    }
}
