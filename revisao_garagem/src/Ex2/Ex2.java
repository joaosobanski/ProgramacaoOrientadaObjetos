package Ex2;

import java.util.ArrayList;

import classes.Pessoa;

public class Ex2 {
    

    public static void main(String[] args) {
        Cadastro cad = new Cadastro();


        System.out.println("Hello, World!");

        String x = "teste";
        
        Pessoa p = new Pessoa(x, 10);
        Pessoa p2 = new Pessoa("maria", 50);


        cad.adicionar(p);
        cad.adicionar(p2);


        System.out.println(cad);


    }

    
}
