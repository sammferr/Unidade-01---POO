// Classe que simula um carro simples
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean estaLigado;

    // Construtor para inicializar o carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.estaLigado = false; // carro inicia desligado
    }

    // Liga o carro se ele estiver desligado
    public void ligarCarro() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Carro já está ligado.");
        }
    }

    // Desliga o carro se ele estiver ligado
    public void desligarCarro() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Carro já está desligado.");
        }
    }

    // Acelera o carro somente se estiver ligado
    public void acelerarCarro() {
        if (estaLigado) {
            System.out.println("Carro acelerando!");
        } else {
            System.out.println("Ligue o carro antes de acelerar.");
        }
    }

    // Exibe os detalhes do carro
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Método principal para testar o funcionamento
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Fiesta", 2019);
        meuCarro.exibirDetalhes();
        meuCarro.ligarCarro();
        meuCarro.acelerarCarro();
        meuCarro.desligarCarro();
    }
}