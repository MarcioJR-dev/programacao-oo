package ED4.model;

/**
 * Interface que define os métodos básicos que todos os contatos devem implementar.
 */
public interface Contato {
    /**
     * Retorna o nome do contato.
     * @return String com o nome do contato
     */
    String getNome();

    /**
     * Define o nome do contato.
     * @param nome String com o nome do contato
     */
    void setNome(String nome);

    /**
     * Retorna o telefone do contato.
     * @return String com o telefone do contato
     */
    String getTelefone();

    /**
     * Define o telefone do contato.
     * @param telefone String com o telefone do contato
     */
    void setTelefone(String telefone);

    /**
     * Retorna o email do contato.
     * @return String com o email do contato
     */
    String getEmail();

    /**
     * Define o email do contato.
     * @param email String com o email do contato
     */
    void setEmail(String email);

    /**
     * Retorna o documento (CPF ou CNPJ) do contato.
     * @return String com o documento do contato
     */
    String getDocumento();

    /**
     * Define o documento (CPF ou CNPJ) do contato.
     * @param documento String com o documento do contato
     */
    void setDocumento(String documento);

    /**
     * Retorna o tipo do contato (Física ou Jurídica).
     * @return String indicando o tipo do contato
     */
    String getTipo();
} 