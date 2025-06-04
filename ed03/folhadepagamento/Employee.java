package ED3.folhadepagamento;

/**
 * Classe abstrata que representa um funcionário genérico.
 * Define a estrutura básica e métodos comuns para todos os tipos de funcionários.
 */
public abstract class Employee {
    protected String name;
    protected double baseSalary;

    /**
     * Construtor da classe Employee.
     * @param name Nome do funcionário
     * @param baseSalary Salário base do funcionário
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /**
     * Exibe os dados básicos do funcionário.
     */
    public void displayData() {
        System.out.println("Nome: " + name);
        System.out.println("Salário Base: " + baseSalary);
    }

    /**
     * Método abstrato para calcular o salário final do funcionário.
     * @return double - Salário final calculado
     */
    public abstract double calculateSalary();
}
