import pessoa.Pessoa;

import imovel.Imovel;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("Maria", 37);

        pessoa.setFone("459999999");

        Imovel local1 = new Imovel("rua do lago", 8590010, 100, "RESIDENCIAL");

        pessoa.setEnderecoTrabalho(local1);

        System.out.println(pessoa);

        // System.out.println(pessoa.getEnderecoTrabalho());

    }
}
