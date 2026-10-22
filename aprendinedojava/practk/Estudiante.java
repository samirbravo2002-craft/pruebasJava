package practk;
public class Estudiante { // 1 "Estudiante" es la clase del modelo.

    // 2 Atributos de la clase
    private String nombre; //letras
    private double nota;   //números decimales


    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //3 El método "aprobo" NO tiene parámetros "()" " y retorna un tipo "boolean"
    public boolean aprobo() {
        /*4 que pasa según la nota:
           - Si la nota es = a 3.0 es true "Aprobó"
           - Si la nota es < a 3.0 es false "No aprobó"
           - Si la nota es > a 5.0 es true "Aprobó" 
        */
        return nota >= 3.0;
    }


    public String obtenerNombre() {
        return nombre;
    }
}


