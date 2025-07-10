public class Animal {
    private String nome;
    private String alimentacao;

    public Animal(String nome, String alimentacao) {
        this.nome = nome;
        this.alimentacao = alimentacao;
    }

    public void exibirSomAnimal() {
        System.out.println(nome + " está emitindo um som!");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Tigre", "Carnívoro");
        System.out.println("Nome: " + animal.nome);
        System.out.println("Alimentação: " + animal.alimentacao);
        animal.exibirSomAnimal();
    }
}