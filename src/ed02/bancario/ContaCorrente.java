package ed02.bancario;

/**
 * Subclasse que representa uma conta corrente.
 */
public class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Tipo: Conta Corrente, Cliente: " + cliente + ", Saldo: " + saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001; // 0.1% de juros ao dia
    }
} 