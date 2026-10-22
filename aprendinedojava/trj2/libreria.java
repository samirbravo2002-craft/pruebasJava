package trj2;


public class libreria { // clase pricipal

    public static void main(String[] args) {
        //1 "estudiante1" y "estudiante2" son los objetos
    

        //objetos 
        datosLibro Libro1 = new datosLibro("Akelarre", "Mario", 001, true);
        datosLibro Libro2 = new datosLibro("elTunel", "Mario", 002, false);
        datosLibro Libro3 = new datosLibro("Maria", "Jorge", 003, true);

        
        mostrarResultado(Libro1);
        mostrarResultado(Libro2);
        mostrarResultado(Libro3);
    }


    public static void mostrarResultado(datosLibro libro) {
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("Titulo: " + libro.obtenerTitulo());
        System.out.println("Autor: " + libro.obtenerAutor());
        System.out.println("Codigo: " + libro.obtenerCodigo());
        System.out.println("Disponible: " + libro.obtenerDisponible());
        System.out.println("---------------------------");

        if (libro.pedirLibro()) {
            System.out.println(
                "Puedes pedir el libro: " + libro.obtenerTitulo() 
            );
        } else {
            System.out.println(
                libro.obtenerTitulo() + " no esta disponible para pedir"
            );
        }
        
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("---------------------------");


    }


  }
       
  
    



