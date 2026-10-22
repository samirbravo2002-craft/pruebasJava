package tienda;

public class cliente {
    private String nombre;
    private int id;
    private String correo;
    private long cedula;

    public cliente(String nombre, int id, String correo, long cedula) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public long getCedula() {
        return cedula;
    }
}