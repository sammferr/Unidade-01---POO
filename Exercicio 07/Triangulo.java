// Representa um triângulo com base e altura
public class Triangulo {
    private double base;
    private double altura;

    // Define base e altura ao criar o objeto
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Retorna a área calculada
    public double area() {
        return (base * altura) / 2;
    }

    // Exemplo de uso para testar a classe
    public static void main(String[] args) {
        Triangulo tri = new Triangulo(8, 5);
        System.out.println("Base: " + tri.base);
        System.out.println("Altura: " + tri.altura);
        System.out.println("Área: " + tri.area());
    }
}