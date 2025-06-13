package ed4.model;

/**
 * Classe abstrata base para todos os tipos de contatos.
 * Implementa a interface Contato e define os atributos e métodos comuns.
 */
public abstract class ContatoBase implements Contato {
    private String nome;
    private String telefone;
    private String email;
    private String documento;

    /**
     * Construtor da classe ContatoBase.
     * @param nome Nome do contato
     * @param telefone Telefone do contato
     * @param email Email do contato
     * @param documento Documento (CPF ou CNPJ) do contato
     */
    public ContatoBase(String nome, String telefone, String email, String documento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Valida se o nome do contato é válido.
     * @param nome Nome a ser validado
     * @return true se o nome for válido, false caso contrário
     */
    public boolean validarNome(String nome) {
        return nome != null && nome.length() >= 3;
    }

    /**
     * Valida se o documento (CPF ou CNPJ) é válido.
     * @param documento Documento a ser validado
     * @return true se o documento for válido, false caso contrário
     */
    public abstract boolean validarDocumento(String documento);
} 