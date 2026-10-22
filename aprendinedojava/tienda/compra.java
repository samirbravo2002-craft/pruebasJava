package tienda;

public class compra {
    public static void main(String[] args) {

        producto producto1 = new producto(1, "lata atun", 3000, true);
        producto producto2 = new producto(2, "libra de frijol", 3500, true);
        producto producto3 = new producto(3, "cubeta de huevo", 15000, true);
        cliente cliente1 = new cliente("Samir Bravo", 1, "SamirBra@example.com", 1005946145);

        double total = producto1.getPrecio() + producto2.getPrecio() + producto3.getPrecio();

        mostrarresultado(cliente1, producto1, producto2, producto3);

        System.out.println("Precio total: $" + total);
    }

    public static void mostrarresultado(cliente cliente, producto producto1, producto producto2, producto producto3) {
        System.out.println("Factura de compra");
        System.out.println("ID de Cliente: " + cliente.getId());
        System.out.println("Nombre de Cliente: " + cliente.getNombre());
        System.out.println("Correo de Cliente: " + cliente.getCorreo());

        System.out.println("Producto Comprado: " + producto1.getNombre());
        System.out.println("Precio del Producto: $" + producto1.getPrecio());

        System.out.println("Producto Comprado: " + producto2.getNombre());
        System.out.println("Precio del Producto: $" + producto2.getPrecio());

        System.out.println("Producto Comprado: " + producto3.getNombre());
        System.out.println("Precio del Producto: $" + producto3.getPrecio());
    }
}