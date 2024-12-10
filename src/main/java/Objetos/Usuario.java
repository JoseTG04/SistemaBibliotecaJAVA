package Objetos;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Libro> librosPrestados;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();

    }

    public void tomarLibro(Libro libro) {
        if (libro.getCantidadDisponible() > 0) {
            librosPrestados.add(libro);
            libro.prestar();
            System.out.println(nombre + " tomó prestado el libro: " + libro.getTitulo());
        } else {
            System.out.println("No se pudo prestar el libro '" + libro.getTitulo() + "' a " + nombre + ".");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.devolver();
            System.out.println(nombre + " devolvió el libro: " + libro.getTitulo());
        } else {
            System.out.println(nombre + " no tiene prestado el libro '" + libro.getTitulo() + "'.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre + ", Libros prestados: ");
        for (Libro libro : librosPrestados) {
            System.out.println(" - " + libro.getTitulo());
        }
    }
}
