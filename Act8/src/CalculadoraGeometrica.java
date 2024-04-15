import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> resultados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Seleccione la figura geométrica:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Potencia");
                int figura = scanner.nextInt();

                if (figura == 6) {
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    double exponente = scanner.nextDouble();
                    double resultado = Potencia.calcularPotencia(base, exponente);
                    resultados.add("La potencia de " + base + " elevado a " + exponente + " es: " + resultado);
                } else {
                    System.out.println("Seleccione la operación:");
                    System.out.println("1. Área");
                    System.out.println("2. Perímetro");
                    int operacion = scanner.nextInt();

                    double resultado = 0;

                    switch (figura) {
                        case 1: // Círculo
                            System.out.print("Ingrese el radio: ");
                            double radio = scanner.nextDouble();
                            Circulo circulo = new Circulo(radio);
                            if (operacion == 1) {
                                resultado = circulo.calcularArea();
                                resultados.add("El área del círculo con radio " + radio + " es: " + resultado);
                            } else {
                                resultado = circulo.calcularPerimetro();
                                resultados.add("El perímetro del círculo con radio " + radio + " es: " + resultado);
                            }
                            break;
                        case 2: // Cuadrado
                            System.out.print("Ingrese el lado: ");
                            double ladoCuadrado = scanner.nextDouble();
                            Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                            if (operacion == 1) {
                                resultado = cuadrado.calcularArea();
                                resultados.add("El área del cuadrado con lado " + ladoCuadrado + " es: " + resultado);
                            } else {
                                resultado = cuadrado.calcularPerimetro();
                                resultados.add("El perímetro del cuadrado con lado " + ladoCuadrado + " es: " + resultado);
                            }
                            break;
                        case 3: // Triángulo
                            System.out.print("Ingrese la base: ");
                            double baseTriangulo = scanner.nextDouble();
                            System.out.print("Ingrese la altura: ");
                            double alturaTriangulo = scanner.nextDouble();
                            Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                            if (operacion == 1) {
                                resultado = triangulo.calcularArea();
                                resultados.add("El área del triángulo con base " + baseTriangulo + " y altura " + alturaTriangulo + " es: " + resultado);
                            } else {
                                resultados.add("No es posible calcular el perímetro de un triángulo con solo la base y la altura.");
                            }
                            break;
                        case 4: // Rectángulo
                            System.out.print("Ingrese la base: ");
                            double baseRectangulo = scanner.nextDouble();
                            System.out.print("Ingrese la altura: ");
                            double alturaRectangulo = scanner.nextDouble();
                            Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                            if (operacion == 1) {
                                resultado = rectangulo.calcularArea();
                                resultados.add("El área del rectángulo con base " + baseRectangulo + " y altura " + alturaRectangulo + " es: " + resultado);
                            } else {
                                resultado = rectangulo.calcularPerimetro();
                                resultados.add("El perímetro del rectángulo con base " + baseRectangulo + " y altura " + alturaRectangulo + " es: " + resultado);
                            }
                            break;
                        case 5: // Pentágono
                            System.out.print("Ingrese el lado: ");
                            double ladoPentagono = scanner.nextDouble();
                            Pentagono pentagono = new Pentagono(ladoPentagono);
                            if (operacion == 1) {
                                resultado = pentagono.calcularArea();
                                resultados.add("El área del pentágono con lado " + ladoPentagono + " es: " + resultado);
                            } else {
                                resultado = pentagono.calcularPerimetro();
                                resultados.add("El perímetro del pentágono con lado " + ladoPentagono + " es: " + resultado);
                            }
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                }

                System.out.println("¿Desea continuar? (s/n)");
                String respuesta = scanner.next();
                continuar = respuesta.equalsIgnoreCase("s");

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine();
            }
        }

        System.out.println("Resultados:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }

        scanner.close();
    }
}