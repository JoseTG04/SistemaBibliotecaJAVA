package Objetos;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaLibros;

    public Biblioteca() {
        listaLibros = new ArrayList<>();

    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Se agregó el libro: " + libro.getTitulo());
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : listaLibros) {
            libro.mostrarInformacion();
        }
    }
}
