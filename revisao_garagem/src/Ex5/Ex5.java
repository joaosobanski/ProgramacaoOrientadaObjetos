package Ex5;
import classes.Garagem;
import classes.Pessoa;
import classes.Veiculo;
import classes.Fabricante;

public class Ex5 {
    public static void main(String[] args) {
        Garagem gar = new Garagem(10);

        Fabricante f = new Fabricante("volks", "alemanha", "Veiculos");

        Pessoa p = new Pessoa("Antonio", 67);

        Veiculo v = new Veiculo("fusca", "AI-123", "azul", 1963, f, p);
        Veiculo v2 = new Veiculo("fusca", "AI-223", "Amarelo", 1963, f, p);


        System.out.println("teste");
        gar.vagasOcupadas();
        gar.listarVeiculosDaGaragem();
        gar.estacionar(v);

        gar.listarVeiculosDaGaragem();

        gar.vagasDisponiveis();
        gar.estacionar(v2);
        gar.vagasDisponiveis();
        gar.vagasOcupadas();
        System.out.println(gar.getVeiculos().length);
        gar.listarVeiculosDaGaragem();

        gar.verificaVaga(20);
        gar.verificaVaga(1);
        gar.verificaVaga(5);


    }
}
