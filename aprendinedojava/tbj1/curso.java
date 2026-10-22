package tbj1;

public class curso {


    // atributos de la clase
    private int Ncurso;
    private String nombreCurso;
    private boolean cursoActivo;

    public curso(int Ncurso, String nombreCurso, boolean cursoActivo) {
        this.Ncurso = Ncurso;
        this.nombreCurso = nombreCurso;
        this.cursoActivo = cursoActivo;
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + Ncurso);
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Activo: " + cursoActivo);
    }

    public int obtenerNcurso() {
        return Ncurso;
    }

    public String obtenerNombreCurso() {
        return nombreCurso;
    }

    public boolean obtenerCursoActivo() {
        return cursoActivo;
    }

    
}
