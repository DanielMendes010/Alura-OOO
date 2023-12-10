package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Máquina Mortifera", 1989);
        meuFilme.avalia(4);
        Serie lost = new Serie("Lost", 2000);
        Filme meuFilme2 = new Filme("Velozes e Furiosos", 2001);
        meuFilme2.avalia(8);
        var meuFilme3 = new Filme("O Poderoso Chefão", 1970);
        meuFilme3.avalia(10);

        /**
         * variaveis f1 e meuFilme fazem referência a um único objeto = Máquina Mortifera
         * Diferente de um tipo primitivo que literalmente copia o valor de uma variavel para outra
         * ex: int valor1 = 10, int valor2 = valor1;
         */
        Filme f1 = meuFilme;

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Owen Wilson");
        buscaPorArtista.add("Angelina Jolie");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        System.out.println("Lista de titulos ordenado");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }

}
