package Metodos;


   //metodo con parametros y con retorno
public class metodoCuatro {

    public static int multip(int a, int b) { //metodo con parametros y con retorno

        int multip = a * b;

        return multip; //retorna el valor de la multiplicacion
    }


    public static void main(String[] args) {
        int resultado = multip(5, 3); //llamamos al metodo y guardamos el resultado en la variable "resultado"
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }



    
}
