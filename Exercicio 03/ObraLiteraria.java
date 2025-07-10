public class ObraLiteraria {
    // Características do livro
    private String nomeDoLivro;
    private String escritor;
    private int totalDePaginas;

    // Construtor para inicializar o livro
    public ObraLiteraria(String nomeDoLivro, String escritor, int totalDePaginas) {
        this.nomeDoLivro = nomeDoLivro;
        this.escritor = escritor;
        this.totalDePaginas = totalDePaginas;
    }

    // Método para mostrar informações do livro
    public void mostrarInformacoes() {
        System.out.println("Nome do livro: " + nomeDoLivro);
        System.out.println("Escritor: " + escritor);
        System.out.println("Total de páginas: " + totalDePaginas);
    }

    // Métodos para acessar e modificar os atributos
    public String pegarNomeDoLivro() {
        return nomeDoLivro;
    }

    public void mudarNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String pegarEscritor() {
        return escritor;
    }

    public void mudarEscritor(String escritor) {
        this.escritor = escritor;
    }

    public int pegarTotalDePaginas() {
        return totalDePaginas;
    }

    public void mudarTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    // Teste da classe
    public static void main(String[] args) {
        ObraLiteraria obra = new ObraLiteraria("Grande Sertão: Veredas", "João Guimarães Rosa", 500);
        obra.mostrarInformacoes();
    }
}