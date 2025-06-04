package ED3.folhadepagamento;

/**
 * Classe que representa um funcionário temporário.
 * Este tipo de funcionário tem um desconto fixo de R$ 100,00.
 */
public class TemporaryEmployee extends Employee {
    private static final double DISCOUNT = 100.0;

    /**
     * Construtor da classe TemporaryEmployee.
     * @param name Nome do funcionário
     * @param baseSalary Salário base do funcionário
     */
    public TemporaryEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    /**
     * Calcula o salário final do funcionário temporário.
     * @return double - Salário base - desconto fixo
     */
    @Override
    public double calculateSalary() {
        return baseSalary - DISCOUNT;
    }
}
