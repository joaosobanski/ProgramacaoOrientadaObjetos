import model.PessoaFisica;
import model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        PessoaFisica pf = new PessoaFisica("Maria", 10, "122312.321321", "1111111-02", "email@email");

        System.out.println(pf);
        
        PessoaJuridica pj = new PessoaJuridica("empresa da maria", 2000, "129382183812-2", "emailempresa@email");
        
        System.out.println(pj);


    }
}
