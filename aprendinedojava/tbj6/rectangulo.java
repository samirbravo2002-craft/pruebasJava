package tbj6;

public class rectangulo {
    Double base;
    Double altura;

    // Constructor
    public rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método SIN parámetros () y CON retorno
    public double calcularArea() {
        double area = this.base * this.altura;
        return area; // Devuelve el resultado
    }

    public static void main(String[] args) {
      
        //objeto 
        rectangulo miRectangulo = new rectangulo(8.0, 5.0);

      
        double resultado = miRectangulo.calcularArea();

    
        System.out.println("El área del rectángulo es: " + resultado);
    }
}