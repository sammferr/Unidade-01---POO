// Representa um produto à venda
public class Produto {
    private String nome;
    private double preco;

    // Construtor para definir nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Calcula o valor final após aplicar o desconto
    public double aplicarDesconto(double descontoPercentual) {
        return preco - (preco * descontoPercentual / 100);
    }

    // Teste rápido da classe
    public static void main(String[] args) {
        Produto prod = new Produto("Notebook", 2800.00);
        System.out.println("Item: " + prod.nome);
        System.out.println("Valor cheio: R$ " + prod.preco);
        System.out.println("Com 15% off: R$ " + prod.aplicarDesconto(15));
    }
}