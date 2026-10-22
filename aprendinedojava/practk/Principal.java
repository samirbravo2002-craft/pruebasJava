package practk;
public class Principal { //1 "Principal" es la clase principal

    public static void main(String[] args) {
        //1 "estudiante1" y "estudiante2" son los objetos
        Estudiante estudiante1 = new Estudiante("Laura", 4.2);
        Estudiante estudiante2 = new Estudiante("Carlos", 2.8);
        

        
        mostrarResultado(estudiante1);
        mostrarResultado(estudiante2);
    }

    public static void mostrarResultado(Estudiante estudiante) {
        if (estudiante.aprobo()) {
            System.out.println(
                estudiante.obtenerNombre() + ": Aprobó"
            );
        } else {
            System.out.println(
                estudiante.obtenerNombre() + ": No aprobó"
            );
        }
    }
}