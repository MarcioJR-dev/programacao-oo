package ed02.bancario;

/**
 * Subclasse que representa uma conta poupança.
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Tipo: Conta Poupança, Cliente: " + cliente + ", Saldo: " + saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08% de juros ao dia
    }
} 