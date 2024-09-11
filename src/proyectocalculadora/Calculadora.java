package proyectocalculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("------------------------------------------");
        System.out.println("Ingrese el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();

        do {
            System.out.println("                   ");

            System.out.println("1. Sumar           ");
            System.out.println("2. Restar          ");
            System.out.println("3. Multiplicar     ");
            System.out.println("4. Dividir         ");
            System.out.println("5. Salir           ");

            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    OperacionesMatematicas cargarOperacionSuma = new OperacionesMatematicas(num1, num2);
                    cargarOperacionSuma.sumar();

                    System.out.println("                                   ");
                    System.out.println("La suma es " + num1 + " + " + num2);
                    System.out.println("El resultado es " + " = " + cargarOperacionSuma.getResultado());
                    System.out.println("                                   ");
                    System.out.println("                                   ");

                    break;

                case 2:
                    OperacionesMatematicas cargarOperacionResta = new OperacionesMatematicas(num1, num2);
                    cargarOperacionResta.restar();

                    System.out.println("                                   ");
                    System.out.println("La Resta es " + num1 + " - " + num2 );
                    System.out.println("El resultado es " + " = " + cargarOperacionResta.getResultado());
                    System.out.println("                                   ");
                    System.out.println("                                   ");

                    break;

                case 3:
                    OperacionesMatematicas cargarOperacionMultiplicacion = new OperacionesMatematicas(num1, num2);
                    cargarOperacionMultiplicacion.multiplicar();

                    System.out.println("                                  ");
                    System.out.println("La Multiplicación es " + num1 + " X " + num2);
                    System.out.println("El resultado es " + " = " + cargarOperacionMultiplicacion.getResultado());
                    System.out.println("                                  ");
                    System.out.println("                                  ");

                    break;

                case 4:
                    OperacionesMatematicas cargarOperacionDivision = new OperacionesMatematicas(num1, num2);
                    cargarOperacionDivision.dividir();

                    System.out.println("                                   ");
                    System.out.println("La operación de la Divisiòn es " + num1 + " / " + num2);
                    System.out.println("El resultado es " + " = " + cargarOperacionDivision.getResultado());
                    System.out.println("                                   ");
                    System.out.println("                                   ");

                    break;

                case 5:
                    scanner.close();

            }

        } while (opcion != 5);

        scanner.close();
    }
}
