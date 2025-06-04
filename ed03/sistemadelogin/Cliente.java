/**
 * Classe que representa um cliente do sistema.
 * Herda de Usuario e implementa apenas a interface Autenticavel.
 */
public class Cliente extends Usuario implements Autenticavel {
    /**
     * Construtor da classe Cliente.
     * @param login Login do cliente
     * @param senha Senha do cliente
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    /**
     * Verifica se a senha fornecida é válida.
     * A senha é considerada válida se tiver mais de 6 caracteres e corresponder à senha atual.
     * @param senha Senha a ser verificada
     * @return boolean - true se a senha for válida, false caso contrário
     */
    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
} 