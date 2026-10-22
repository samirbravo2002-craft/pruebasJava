package Metodos;

public class metodoTres {


      //atributos del objeto
    private String nombre;
    private int edad;

       //constructor 
    public metodoTres(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   


    //no tiene parametros dentro del parentesis (), osea sin parametros  

    /*con retorno, ya que "return edad" nos devuelve el valor de edad
    que ya se definio como atributo del objeto */

    public int obtenerEdad() {  //metodo sin parametros y con retorno
        return edad;
    }



   /* public static void main(String[] args) {
        metodoTres persona = new metodoTres("Samir", 24);
        int edadPersona = persona.obtenerEdad();
        System.out.println("La edad de " + persona.nombre + " es: " + edadPersona);
    }*/ 


    
}
