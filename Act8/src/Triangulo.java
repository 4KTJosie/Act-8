public class Triangulo {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor para triángulo con base y altura
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Constructor para triángulo con lados
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}