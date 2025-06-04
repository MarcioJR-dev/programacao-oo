package ED4.view;

import ED4.controller.ContatoController;
import ED4.model.Contato;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável pela interface com o usuário.
 */
public class ContatoView {
    private ContatoController controller;
    private Scanner scanner;

    /**
     * Construtor da classe ContatoView.
     * @param controller Controlador da agenda de contatos
     */
    public ContatoView(ContatoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Exibe o menu principal da aplicação.
     */
    public void exibirMenu() {
        while (true) {
            System.out.println("\n=== Agenda de Contatos ===");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Atualizar Contato");
            System.out.println("5. Remover Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    buscarContato();
                    break;
                case 4:
                    atualizarContato();
                    break;
                case 5:
                    removerContato();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void adicionarContato() {
        System.out.println("\n=== Adicionar Contato ===");
        System.out.println("1. Pessoa Física");
        System.out.println("2. Pessoa Jurídica");
        System.out.print("Escolha o tipo: ");
        
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();

        boolean sucesso = false;
        if (tipo == 1) {
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            sucesso = controller.adicionarContato(controller.criarPessoaFisica(nome, telefone, email, cpf));
        } else if (tipo == 2) {
            System.out.print("CNPJ: ");
            String cnpj = scanner.nextLine();
            sucesso = controller.adicionarContato(controller.criarPessoaJuridica(nome, telefone, email, cnpj));
        }

        if (sucesso) {
            System.out.println("Contato adicionado com sucesso!");
        } else {
            System.out.println("Erro ao adicionar contato. Verifique os dados.");
        }
    }

    private void listarContatos() {
        List<Contato> contatos = controller.listarContatos();
        if (contatos.isEmpty()) {
            System.out.println("\nNenhum contato cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Contatos ===");
        System.out.printf("%-30s %-15s %-30s %-20s %-15s%n", 
            "Nome", "Tipo", "Email", "Telefone", "Documento");
        System.out.println("-".repeat(110));

        for (Contato contato : contatos) {
            System.out.printf("%-30s %-15s %-30s %-20s %-15s%n",
                contato.getNome(),
                contato.getTipo(),
                contato.getEmail(),
                contato.getTelefone(),
                contato.getDocumento());
        }
    }

    private void buscarContato() {
        System.out.print("\nDigite o CPF ou CNPJ do contato: ");
        String documento = scanner.nextLine();

        Contato contato = controller.buscarContato(documento);
        if (contato != null) {
            System.out.println("\n=== Contato Encontrado ===");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Tipo: " + contato.getTipo());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Documento: " + contato.getDocumento());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private void atualizarContato() {
        System.out.print("\nDigite o CPF ou CNPJ do contato a ser atualizado: ");
        String documento = scanner.nextLine();

        Contato contatoAntigo = controller.buscarContato(documento);
        if (contatoAntigo == null) {
            System.out.println("Contato não encontrado.");
            return;
        }

        System.out.println("\n=== Atualizar Contato ===");
        System.out.print("Novo nome [" + contatoAntigo.getNome() + "]: ");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) nome = contatoAntigo.getNome();

        System.out.print("Novo telefone [" + contatoAntigo.getTelefone() + "]: ");
        String telefone = scanner.nextLine();
        if (telefone.isEmpty()) telefone = contatoAntigo.getTelefone();

        System.out.print("Novo email [" + contatoAntigo.getEmail() + "]: ");
        String email = scanner.nextLine();
        if (email.isEmpty()) email = contatoAntigo.getEmail();

        Contato novoContato;
        if (contatoAntigo.getTipo().equals("Pessoa Física")) {
            novoContato = controller.criarPessoaFisica(nome, telefone, email, documento);
        } else {
            novoContato = controller.criarPessoaJuridica(nome, telefone, email, documento);
        }

        if (controller.atualizarContato(documento, novoContato)) {
            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Erro ao atualizar contato.");
        }
    }

    private void removerContato() {
        System.out.print("\nDigite o CPF ou CNPJ do contato a ser removido: ");
        String documento = scanner.nextLine();

        if (controller.removerContato(documento)) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
} 