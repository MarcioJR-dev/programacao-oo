package ED4.model;

/**
 * Classe que representa uma Pessoa Física na agenda de contatos.
 * Herda de ContatoBase e implementa a validação específica para CPF.
 */
public class PessoaFisica extends ContatoBase {
    
    /**
     * Construtor da classe PessoaFisica.
     * @param nome Nome da pessoa física
     * @param telefone Telefone da pessoa física
     * @param email Email da pessoa física
     * @param cpf CPF da pessoa física
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
    }

    @Override
    public boolean validarDocumento(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");
        
        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Validação do primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digito1 = resto > 9 ? 0 : resto;
        if (digito1 != (cpf.charAt(9) - '0')) {
            return false;
        }

        // Validação do segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        resto = 11 - (soma % 11);
        int digito2 = resto > 9 ? 0 : resto;
        if (digito2 != (cpf.charAt(10) - '0')) {
            return false;
        }

        return true;
    }

    @Override
    public String getTipo() {
        return "Pessoa Física";
    }
} 