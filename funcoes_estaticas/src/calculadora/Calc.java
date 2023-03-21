package calculadora;

// uma classe abstrada não recebe um construtor
// normlamente é usada para quando precisa criar classes genericas e classes que executam apenas funções estaticas
public abstract class Calc {

    // função estática funciona apenas com valores do parametro 
    // é uma função isolada! como no caso abaixo só identifica os atributos a e b
    // e uma função estática não precisa de um instancia para consumir
    // nesse caso ficaria apenas Calc.somar(1, 1);
    public static void somar(int a, int b) {
        System.out.println(a + b);
    }

    public static void multiplicacao(int a, int b) {
        System.out.println(a * b);
    }

    public static void divisao(int a, int b) {
        System.out.println(a / b);
    }

    public static void subtracao(int a, int b) {
        System.out.println(a - b);
    } 
}
