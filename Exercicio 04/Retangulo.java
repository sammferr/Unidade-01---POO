// Classe Retangulo: representa um terreno com formato retangular
public class Retangulo {
    // Atributos principais do retângulo
    private double comprimento;
    private double largura;

    // Construtor para inicializar os atributos
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Método que calcula a área do retângulo
    public double calcularArea() {
        return comprimento * largura;
    }

    // Método que calcula o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Retangulo terreno = new Retangulo(10.0, 6.0);

        System.out.println("Comprimento: " + terreno.comprimento);
        System.out.println("Largura: " + terreno.largura);
        System.out.println("Área: " + terreno.calcularArea());
        System.out.println("Perímetro: " + terreno.calcularPerimetro());
    }
}