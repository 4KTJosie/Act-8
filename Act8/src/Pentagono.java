public class Pentagono {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return (1.0 / 4.0) * Math.sqrt(25 + 10 * Math.sqrt(5)) * lado * lado;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }
}