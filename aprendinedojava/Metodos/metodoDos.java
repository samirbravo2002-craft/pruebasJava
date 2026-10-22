package Metodos;


   //con paramatro y sin retorno
public class metodoDos {


         /*es con parametro, ya que lo definimos despuesd de "mostrarResta"en los 
         parentesis (parametros = a, b) */

         /* es sin retorno, ya que la palabra "void" indica que no devuelve ningún 
         valor, solo nos dice que nos imprima el resultado, indicandole el valor
         que le vamos a dar a los parametros */
    public static void mostrarResta(int a, int b) {
        System.out.println(a - b);
    }


    public static void main(String[] args) {
        mostrarResta(10, 5);
    }

    
}
