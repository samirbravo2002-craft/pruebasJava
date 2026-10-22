package tjb5;

public class contador {

    public static void incremetarContador(int limite) {
        int contador = 1;

        for (int i = 1; i <= limite; i++) {
            contador++;
            System.out.println("Contador: " + contador);
        }
    }


    public static void main(String[] args) {
        incremetarContador(25);
    }
    
}
