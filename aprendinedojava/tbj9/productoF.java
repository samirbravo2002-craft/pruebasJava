package tbj9;

public class productoF {
    private String nombre;
    private double precio;
    private int cantidad;
    private String categoria;

    // Constructor 
    public productoF(String nombre, double precio, int cantidad, String categoria) {
        // Validación: El nombre no puede ser nulo ni vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: El producto debe tener un nombre válido.");
        }
        
        // Validación: El precio debe ser mayor a 0
        if (precio <= 0) {
            throw new IllegalArgumentException("Error: El precio debe ser mayor a cero.");
        }
        
        // Validación: La cantidad no puede ser negativa
        if (cantidad < 0) {
            throw new IllegalArgumentException("Error: La cantidad no puede ser negativa.");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        
        // Manejo de la categoría opcional (si viene vacía o nula, asignamos un valor predeterminado)
        if (categoria == null || categoria.trim().isEmpty()) {
            this.categoria = "General"; // Valor predeterminado coherente
        } else {
            this.categoria = categoria;
        }
    }

    // Métodos Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public static void main(String[] args) {
        //creacion valida 
        try {
            productoF productoValido = new productoF("Jeans Slim", 120000.0, 15, "Ropa");
            System.out.println("¡Éxito! Creado: " + productoValido.getNombre() + 
                               " | Precio: $" + productoValido.getPrecio() + 
                               " | Cantidad: " + productoValido.getCantidad() + 
                               " | Categoría: " + productoValido.getCategoria());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //valor predeterminado
        try {
            productoF productoPredeterminado = new productoF("Camisa Básica", 45000.0, 50, "");
            System.out.println("¡Éxito! Creado: " + productoPredeterminado.getNombre() + 
                               " | Categoría asignada por defecto: " + productoPredeterminado.getCategoria());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //intento invalido 
        try {
            // Este lanzará una excepción porque el precio es inválido
            productoF productoInvalido = new productoF("Zapatos", -5000.0, 10, "Calzado");
            System.out.println("¡Éxito! Creado: " + productoInvalido.getNombre());
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado correctamente: " + e.getMessage());
        }
    }
}