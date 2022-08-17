package poo.collection;

import java.util.ArrayList;
import java.util.List;
import poo.heranca_exercicio.Livro;

public class MinhaColecao {
    public static void main(String[] args) {
        // Declaração da collection:
        List<Livro> livros = new ArrayList<Livro>();

        Livro l1 = new Livro("Minha coleção parte I");
        Livro l2 = new Livro("Minha coleção parte II");
        Livro l3 = new Livro("Minha coleção parte III");
        Livro l4 = new Livro("Minha coleção parte IV");

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);

        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }

        for (Livro l : livros) {
            System.out.println(l);
        }

        livros.remove(0);
    }
}
