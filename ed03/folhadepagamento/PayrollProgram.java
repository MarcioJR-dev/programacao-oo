package ED3.folhadepagamento;

/**
 * Classe principal que demonstra o funcionamento do sistema de folha de pagamento.
 */
public class PayrollProgram {
    /**
     * Método principal que cria e testa diferentes tipos de funcionários.
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Criando um funcionário CLT
        FullTimeEmployee carlos = new FullTimeEmployee("Carlos", 2000.0);
        
        // Criando um funcionário temporário
        TemporaryEmployee ana = new TemporaryEmployee("Ana", 2000.0);

        // Exibindo dados do funcionário CLT
        carlos.displayData();
        System.out.println("Salário Final: " + carlos.calculateSalary());
        System.out.println();

        // Exibindo dados do funcionário temporário
        ana.displayData();
        System.out.println("Salário Final: " + ana.calculateSalary());
    }
}
