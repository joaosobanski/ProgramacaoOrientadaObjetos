import modelo.Pessoa;
import validador.Teste;

public class ExemploTryCatch {
    public static void Exemplo() {
        System.out.println("Hello, World!");

        // try catch é um escopo para tratar erros e excessões

        Object x = 10;

        // conversão de duas formas distintas
        int n = (int) x;
        int n2 = Integer.parseInt(x.toString());

        Object y = null;
        // vai terntar convernter um valor nulo por inteiro e vai dar exception
        // ao dar exception ira devolver o valor inicial 0
        int n3 = Teste.converteParaInteiro(y);
        System.out.println(n3);

        // como validar os dados da pessoa Nome Email

        Pessoa p = new Pessoa("joao", null);
        System.out.println(p);
    }
}
