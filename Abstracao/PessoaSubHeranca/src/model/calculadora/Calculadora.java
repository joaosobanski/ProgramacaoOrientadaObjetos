package model.calculadora;

public class Calculadora {
    // static e usado para consumir o metodo sem precisar definir a criação da
    // classe ou instancia
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int[] valores) {
        int total = 0;

        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }

        return total;
    }
}
