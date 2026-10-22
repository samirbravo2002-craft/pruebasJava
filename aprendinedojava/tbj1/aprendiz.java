package tbj1;

public class aprendiz { // clase principal

    // atributos de la clase
    private int idAprendiz;
    private static String nombreAprendiz;
    private boolean activo;

    public aprendiz(int idAprendiz, String nombreAprendiz, boolean activo) {
        this.idAprendiz = idAprendiz;
        aprendiz.nombreAprendiz = nombreAprendiz;
        this.activo = activo;
    }



    // metodo
    public void mostrarAprendiz() {
        System.out.println("Aprendiz: " + idAprendiz);
        System.out.println("Nombre: " + nombreAprendiz);
        System.out.println("Activo: " + activo);
    }

    public int obtenerIdAprendiz() {
        return idAprendiz;
    }

    public static String obtenerNombreAprendiz() {
        return nombreAprendiz;
    }

    public boolean obtenerActivo() {
        return activo;
    }


}
