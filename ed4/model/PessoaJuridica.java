package ed4.model;

/**
 * Classe que representa uma Pessoa Jurídica na agenda de contatos.
 * Herda de ContatoBase e implementa a validação específica para CNPJ.
 */
public class PessoaJuridica extends ContatoBase {
    
    /**
     * Construtor da classe PessoaJuridica.
     * @param nome Nome da pessoa jurídica
     * @param telefone Telefone da pessoa jurídica
     * @param email Email da pessoa jurídica
     * @param cnpj CNPJ da pessoa jurídica
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email, cnpj);
    }

    @Override
    public boolean validarDocumento(String cnpj) {
        // Remove caracteres não numéricos
        cnpj = cnpj.replaceAll("[^0-9]", "");
        
        // Verifica se tem 14 dígitos
        if (cnpj.length() != 14) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        // Validação do primeiro dígito verificador
        int soma = 0;
        int peso = 5;
        for (int i = 0; i < 12; i++) {
            soma += (cnpj.charAt(i) - '0') * peso;
            peso = peso == 2 ? 9 : peso - 1;
        }
        int resto = soma % 11;
        int digito1 = resto < 2 ? 0 : 11 - resto;
        if (digito1 != (cnpj.charAt(12) - '0')) {
            return false;
        }

        // Validação do segundo dígito verificador
        soma = 0;
        peso = 6;
        for (int i = 0; i < 13; i++) {
            soma += (cnpj.charAt(i) - '0') * peso;
            peso = peso == 2 ? 9 : peso - 1;
        }
        resto = soma % 11;
        int digito2 = resto < 2 ? 0 : 11 - resto;
        if (digito2 != (cnpj.charAt(13) - '0')) {
            return false;
        }

        return true;
    }

    @Override
    public String getTipo() {
        return "Pessoa Jurídica";
    }
} 