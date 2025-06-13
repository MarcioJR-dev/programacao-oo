package ed4;

import ed4.controller.ContatoController;
import ed4.view.ContatoView;

/**
 * Classe principal que inicia a aplicação da Agenda de Contatos.
 */
public class Main {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView(controller);
        view.exibirMenu();
    }
} 