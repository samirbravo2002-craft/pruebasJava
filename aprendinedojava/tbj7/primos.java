package tbj7;

  public class primos {


    public static void main(String[] args) {
        Calculador calculador = new Calculador();
        int [] numeros = {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int numero : numeros) {
            if (calculador.esPrimo(numero)) {
                System.out.println(numero + " es primo.");
            } else {
                System.out.println(numero + " no es primo.");
            }
        }
       
    }
}
