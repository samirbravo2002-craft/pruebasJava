package banco;

public class personas {

    // Atributos de instancia (sin static para que pertenezcan al objeto)
    private String titular;
    private double saldo;
    private boolean cuentaActiva;

    // Constructor para inicializar los datos al crear el objeto
    public personas(String nombreTitular, double saldoInicial, boolean estado) {
        this.titular = nombreTitular;
        this.saldo = saldoInicial;
        this.cuentaActiva = estado;
    }

    // Método SIN parámetros () y SIN retorno (void)
    public void consultarEstado() {
        System.out.println("Nombre del titular: " + this.titular);
        System.out.println("Saldo actual: $" + this.saldo);

        System.out.println("Estado de la cuenta:");
        if (this.cuentaActiva == true) {
            System.out.println("La cuenta está activa.");
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }

    public static void main(String[] args) {
        // Se crea el objeto usando el constructor
        personas persona1 = new personas("Samir Bravo", 1000.0, true);

        // Se ejecuta la acción consultando a través del objeto
        persona1.consultarEstado();
    }
}