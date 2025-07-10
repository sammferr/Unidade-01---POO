// Classe para simular uma conta de banco
public class ContaBancaria {
    private String conta;
    private double saldo;

    // Inicializa conta e saldo
    public ContaBancaria(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    // Adiciona valor ao saldo
    public void depositar(double valor) {
        saldo += valor;
    }

    // Remove valor do saldo se houver dinheiro suficiente
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Não foi possível sacar: saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    // Mostra os dados da conta
    public void exibirDados() {
        System.out.println("Número da conta: " + conta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("557799-X", 500.0);
        contaBancaria.depositar(100.0);
        contaBancaria.sacar(200.0);
        contaBancaria.exibirDados();
    }
}