package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;


public class PrincipalConListas {
    private static Object Collection;

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragón", 2022);

        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println("Lista de Artistas no ordenada:" + listaDeArtistas);



        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada:" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados:" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("Lista ordenada por fecha:" + lista);
    }
}

