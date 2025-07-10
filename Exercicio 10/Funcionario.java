// Representa um funcionário no sistema de RH
public class Funcionario {
    private String nome;
    private String funcao;
    private double salario;

    // Inicializa o funcionário com nome, função e salário
    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    // Calcula o salário após aplicar o aumento percentual
    public double aplicarAumento(double percentual) {
        return salario + (salario * percentual / 100);
    }

    // Mostra informações do funcionário
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Salário atual: R$ " + salario);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", "Supervisor", 4500.00);
        funcionario.mostrarInfo();
        System.out.println("Salário após aumento de 15%: R$ " + funcionario.aplicarAumento(15));
    }
}