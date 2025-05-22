package ed02.bancario;

/**
 * Classe principal interativa para o Sistema Bancário.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);
        Conta[] contas = {cc, cp, cs};
        String[] nomes = {"Conta Corrente", "Conta Poupança", "Conta Salário"};
        boolean rodando = true;
        while (rodando) {
            System.out.println("\n--- Menu Bancário ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Aplicar Juros Diários");
            System.out.println("5. Imprimir Extratos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    for (int i = 0; i < contas.length; i++)
                        System.out.println((i+1)+". "+nomes[i]);
                    System.out.print("Escolha a conta para depositar: ");
                    int cDep = scanner.nextInt()-1;
                    System.out.print("Valor: ");
                    double vDep = scanner.nextDouble();
                    contas[cDep].depositar(vDep);
                    break;
                case 2:
                    for (int i = 0; i < contas.length; i++)
                        System.out.println((i+1)+". "+nomes[i]);
                    System.out.print("Escolha a conta para sacar: ");
                    int cSaq = scanner.nextInt()-1;
                    System.out.print("Valor: ");
                    double vSaq = scanner.nextDouble();
                    contas[cSaq].sacar(vSaq);
                    break;
                case 3:
                    for (int i = 0; i < contas.length; i++)
                        System.out.println((i+1)+". "+nomes[i]);
                    System.out.print("Conta de origem: ");
                    int origem = scanner.nextInt()-1;
                    System.out.print("Conta de destino: ");
                    int destino = scanner.nextInt()-1;
                    System.out.print("Valor: ");
                    double vTransf = scanner.nextDouble();
                    contas[origem].transferir(contas[destino], vTransf);
                    break;
                case 4:
                    for (Conta conta : contas) conta.aplicarJurosDiarios();
                    System.out.println("Juros aplicados!");
                    break;
                case 5:
                    for (Conta conta : contas) conta.imprimirExtrato();
                    break;
                case 6:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
} 