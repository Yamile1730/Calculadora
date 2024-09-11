package proyectocalculadora;

public class OperacionesMatematicas {

    private double num1;
    private double num2;
    private double resultado;

    // Constructor que recibe dos números
    public OperacionesMatematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sumar() {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = num1 + num2;
        return resultado;
    }
    public double restar() {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = num1 - num2;
        return resultado;
    }
    public double multiplicar() {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = num1 * num2;
        return resultado;
    }
    public double dividir() {
        if (num2 != 0) {
            this.num1 = num1;
            this.num2 = num2;
            this.resultado = num1 / num2;
            return resultado;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }

    }

    public double getResultado() {
        return resultado;
    }

}
