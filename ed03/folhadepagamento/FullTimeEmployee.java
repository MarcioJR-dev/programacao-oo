package ED3.folhadepagamento;

/**
 * Classe que representa um funcionário CLT.
 * Este tipo de funcionário recebe um adicional fixo de R$ 300,00.
 */
public class FullTimeEmployee extends Employee {
    private static final double BONUS = 300.0;

    /**
     * Construtor da classe FullTimeEmployee.
     * @param name Nome do funcionário
     * @param baseSalary Salário base do funcionário
     */
    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    /**
     * Calcula o salário final do funcionário CLT.
     * @return double - Salário base + bônus fixo
     */
    @Override
    public double calculateSalary() {
        return baseSalary + BONUS;
    }
}
