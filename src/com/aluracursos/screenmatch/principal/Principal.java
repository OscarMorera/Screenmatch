package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.calculos.calculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setduracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);


        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie ("La casa del dragón",2022);

        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getduracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setduracionEnMinutos(120);

        calculadoraDeTiempo calculadora = new calculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(casaDragon);
        calculadora.incluido(otraPelicula);
        System.out.println( "Tiempo necesario para ver tus titulos favoritos estas vacaciones" + calculadora.getTiempoTotal() + "minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setduracionEnMinutos(180);
        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista" + listaDePeliculas.size());
        System.out.println("La primera peliucla es" +listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula" + listaDePeliculas.get(0).toString());












    }
}
