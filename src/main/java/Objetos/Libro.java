package Objetos;

public class Libro {
    private String titulo;
    private String autor;
    private int cantidadDisponible;

    // Constructor
    public Libro(String titulo, String autor, int cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }


    public void prestar() {
        if (cantidadDisponible > 0) {
            cantidadDisponible--;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("No hay copias disponibles de '" + titulo + "'.");
        }
    }

    public void devolver() {
        cantidadDisponible++;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Copias disponibles: " + cantidadDisponible);
    }

}
