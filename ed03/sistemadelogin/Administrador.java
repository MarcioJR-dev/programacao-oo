/**
 * Classe que representa um administrador do sistema.
 * Implementa as interfaces Autenticavel, Gerenciavel e Registravel.
 */
public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Registravel {
    /**
     * Construtor da classe Administrador.
     * @param login Login do administrador
     * @param senha Senha do administrador
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    /**
     * Verifica se a senha fornecida é válida.
     * @param senha Senha a ser verificada
     * @return boolean - true se a senha for igual à armazenada
     */
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    /**
     * Altera a senha do administrador.
     * @param novaSenha Nova senha
     */
    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    /**
     * Bloqueia o usuário.
     */
    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    /**
     * Registra uma operação no log de auditoria.
     * @param operacao Operação a ser registrada
     */
    @Override
    public void registrarOperacao(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
} 