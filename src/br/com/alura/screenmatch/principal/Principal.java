package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Máquina Mortifera", 1989);
//        meuFilme.setNome("Máquina Mortifera");
//        meuFilme.setAnoDeLancamento(1989);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme("Velozes e Furiosos", 2001);
//        meuFilme2.setNome("Velozes e Furiosos");
//        meuFilme2.setAnoDeLancamento(2001);
        meuFilme2.setDuracaoEmMinutos(150);
        System.out.println("Duração do filme: " + meuFilme2.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(meuFilme2);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);

        var meuFilme3 = new Filme("O Poderoso Chefão", 1970);
        meuFilme3.setDuracaoEmMinutos(200);
//        meuFilme3.setNome("O Poderoso Chefão");
//        meuFilme3.setAnoDeLancamento(1970);
        meuFilme3.avalia(10);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(meuFilme);
        filmes.add(meuFilme2);
        filmes.add(meuFilme3);
        System.out.println("Tamanho da lista: " + filmes.size());
        System.out.println("Primeiro filme: " + filmes.get(0).getNome());
        System.out.println(filmes);
        System.out.println("toString do filme: " + filmes.get(0).toString());
    }
}
