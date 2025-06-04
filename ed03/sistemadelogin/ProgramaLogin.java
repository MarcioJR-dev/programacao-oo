/**
 * Classe principal que demonstra o funcionamento do sistema de login.
 */
public class ProgramaLogin {
    /**
     * Método principal que cria e testa diferentes tipos de usuários.
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Criando um administrador
        Administrador admin = new Administrador("admin", "admin123");
        
        // Criando um visitante
        Convidado convidado = new Convidado("guest", "qualquer");
        
        // Criando um cliente
        Cliente cliente = new Cliente("joao", "segredo123");

        // Testando o administrador
        admin.displayLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha");
        admin.bloquearUsuario();
        admin.registrarOperacao("Exclusão de conta");
        System.out.println();

        // Testando o visitante
        convidado.displayLogin();
        System.out.println();

        // Testando o cliente
        cliente.displayLogin();
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
} 