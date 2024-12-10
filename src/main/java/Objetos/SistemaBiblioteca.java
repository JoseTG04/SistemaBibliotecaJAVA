package Objetos;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 3);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 2);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Registrar un usuario
        Usuario usuario = new Usuario("Juan");

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();

        // Usuario toma prestado un libro
        usuario.tomarLibro(libro1);

        // Mostrar libros disponibles después de prestar
        biblioteca.mostrarLibrosDisponibles();

        // Usuario devuelve el libro
        usuario.devolverLibro(libro1);

        // Mostrar libros disponibles después de la devolución
        biblioteca.mostrarLibrosDisponibles();

        // Mostrar información del usuario
        usuario.mostrarInformacion();
    }
}
