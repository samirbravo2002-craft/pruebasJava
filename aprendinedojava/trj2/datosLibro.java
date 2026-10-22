package trj2;

public class datosLibro { //clase principal
 
    //atributos de la clase
    private String titulo;
    private String autor;
    private int codigo;
    private boolean disponible;


    public datosLibro(String tituloLibro, String autorLibro, int codigoLibro, boolean dispLibro) {
        this.titulo = tituloLibro;
        this.autor = autorLibro;
        this.codigo = codigoLibro;
        this.disponible = dispLibro;
    }


    public datosLibro(Object tituloLibro, Object autorLibro, Object codigoLibro, Object dispLibro) {
    }


    //metodo
    public void mostrarDatos() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("codigo: " + codigo);
        System.out.println("disponible: " + disponible);
    }


    public boolean pedirLibro() {
        return disponible == true;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public String obtenerAutor() {
        return autor;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public boolean obtenerDisponible() {
        return disponible;
    }






}

