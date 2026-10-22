package practk;
public class FichaEstudiante {

    public static void main(String[] args) {
        String nombre = "Samir"; //1 string es tipo texto
        int edad = 24; // 2 se guarda en entero, porque es el tipo de dato de los numeros enteros
        double estatura = 1.80; //3 se gurada en double, porque es el tipo de dato de los numeros decimales
        String gradoGrupo = "ADSO";
        double notaFinal = 4.99;

        //4 la diferencia entre "char" y "String" es que "char" es un solo caracter, mientras que "String" es una cadena de caracteres.

        //5 un "boolean" puede ser true o false, es decir 1 o 0

        
        boolean aprobo = notaFinal >= 3.0;


    
        System.out.println("Nombre:           " + nombre);
        System.out.println("Edad:             " + edad + " años");
        System.out.println("Estatura:         " + estatura + " m");
        System.out.println("Grado / Grupo:    " + gradoGrupo);
        System.out.println("Nota Final:       " + notaFinal);
        System.out.println("Estado:           " + (aprobo ? "Aprobó" : "No aprobó"));
        
    }
}