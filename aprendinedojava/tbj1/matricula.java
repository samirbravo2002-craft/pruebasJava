package tbj1;

public class matricula { // clase pricipal

    public static void main(String[] args) {
        //1 "estudiante1" y "estudiante2" son los objetos
        aprendiz aprendiz1 = new aprendiz(1, "Laura", true);
        aprendiz aprendiz2 = new aprendiz(2, "Carlos", true);
        curso curso1 = new curso(3, "adso", true);
        curso curso2 = new curso(4, "ingles", false);

        mostrarmatricula(curso1, aprendiz1);
        mostrarmatricula(curso2, aprendiz2);
        mostrarmatricula(curso1, aprendiz2);
    }

    public static void mostrarmatricula(curso curso, aprendiz estudiante) {
        System.out.println("Aprendiz: " + aprendiz.obtenerNombreAprendiz());
        System.out.println("Curso: " + curso.obtenerNombreCurso());
        System.out.println("Matricula: " + curso.obtenerCursoActivo() );
        System.out.println("---------------------------");
    }

  }
       
  
    



