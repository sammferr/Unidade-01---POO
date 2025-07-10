// Classe Circulo 
public class Circulo {
    // Atributo 
    private double raio;

    // Construtor da classe 
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método público que calcula e retorna a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio; // Fórmula da área: π * r²
    }

    // Método público que calcula e retorna o perímetro (circunferência) do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio; // Fórmula do perímetro: 2 * π * r
    }

    //getter para obter o valor do raio
    public double getRaio() {
        return raio;
    }

    //setter para alterar o valor do raio
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public static void main(String[] args) {
        // Criando um objeto Circulo com raio 5.0
        Circulo circulo = new Circulo(5.0);

        // Exibindo os resultados no console
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}