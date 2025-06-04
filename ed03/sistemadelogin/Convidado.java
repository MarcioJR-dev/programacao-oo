/**
 * Classe que representa um visitante do sistema.
 * Herda de Usuario mas não implementa nenhuma interface.
 */
public class Convidado extends Usuario {
    /**
     * Construtor da classe Convidado.
     * @param login Login do visitante
     * @param senha Senha do visitante
     */
    public Convidado(String login, String senha) {
        super(login, senha);
    }

    /**
     * Sobrescreve o método displayLogin para exibir uma mensagem específica.
     */
    @Override
    public void displayLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
} 