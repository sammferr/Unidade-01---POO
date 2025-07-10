// Representa uma pessoa convidada para o evento social
public class Convidado {
    // Informações pessoais
    private String nomeCompleto;
    private int anos;

    // Construtor para definir os dados da pessoa
    public Convidado(String nomeCompleto, int anos) {
        this.nomeCompleto = nomeCompleto;
        this.anos = anos;
    }

    // Método para dar as boas-vindas ao convidado
    public void saudar() {
        System.out.println("É um prazer ter você conosco, " + nomeCompleto + "!");
    }

    // Métodos para acessar os atributos
    public String obterNome() {
        return nomeCompleto;
    }

    public void alterarNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int obterIdade() {
        return anos;
    }

    public void alterarIdade(int anos) {
        this.anos = anos;
    }

    // Teste simples da classe
    public static void main(String[] args) {
        Convidado convidado = new Convidado("Samuel", 28);
        convidado.saudar();
    }
}