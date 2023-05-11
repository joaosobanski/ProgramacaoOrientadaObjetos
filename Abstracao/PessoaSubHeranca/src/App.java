import model.calculadora.Calculadora;
import model.pessoa.Cliente;
import model.pessoa.Fornecedor;
import model.pessoa.PessoaFisica;
import model.pessoa.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        PessoaFisica pf = new PessoaFisica("Maria", 10, "122312.321321", "1111111-02", "email@email");

        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica("empresa da maria", 2000, "129382183812-2", "emailempresa@email");

        System.out.println(pj);

        // exemplo de herança de uma classe com construtor usando polimorfismo
        // definição de polimorfismo é possuir mais de uma função com nomes iguais porem
        // parametros diferentes
        Fornecedor f2 = new Fornecedor("fornecedor da maria", 2000, "123-2", "emailfornecedor@email");

        System.out.println(f2);

        Cliente cl = new Cliente("Pedro", 22, "321.321321", "321-02", "emailpedro@email", "teste");

        System.out.println(cl);

        // PessoaJuridica a = new PessoaJuridica();

        // PessoaFisica b = new PessoaFisica(null, 0, null, null, null);

        // f.setFone("123213");

        // Calculadora c = new Calculadora();
        // c.somar(0, 0);

        System.out.println(
                Calculadora.somar(1, 3));

        int[] valores = new int[3];
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;

        System.out.println(
                Calculadora.somar(valores));

    }
}
