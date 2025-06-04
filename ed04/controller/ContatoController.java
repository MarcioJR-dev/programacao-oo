package ED4.controller;

import ED4.model.Contato;
import ED4.model.PessoaFisica;
import ED4.model.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe controladora que gerencia a lógica de negócios da agenda de contatos.
 */
public class ContatoController {
    private List<Contato> contatos;

    /**
     * Construtor da classe ContatoController.
     */
    public ContatoController() {
        this.contatos = new ArrayList<>();
    }

    /**
     * Adiciona um novo contato à agenda.
     * @param contato Contato a ser adicionado
     * @return true se o contato foi adicionado com sucesso, false caso contrário
     */
    public boolean adicionarContato(Contato contato) {
        if (contato == null) {
            return false;
        }

        // Verifica se já existe um contato com o mesmo documento
        for (Contato c : contatos) {
            if (c.getDocumento().equals(contato.getDocumento())) {
                return false;
            }
        }

        return contatos.add(contato);
    }

    /**
     * Remove um contato da agenda pelo documento.
     * @param documento CPF ou CNPJ do contato a ser removido
     * @return true se o contato foi removido com sucesso, false caso contrário
     */
    public boolean removerContato(String documento) {
        return contatos.removeIf(c -> c.getDocumento().equals(documento));
    }

    /**
     * Atualiza os dados de um contato existente.
     * @param documento CPF ou CNPJ do contato a ser atualizado
     * @param novoContato Novos dados do contato
     * @return true se o contato foi atualizado com sucesso, false caso contrário
     */
    public boolean atualizarContato(String documento, Contato novoContato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getDocumento().equals(documento)) {
                contatos.set(i, novoContato);
                return true;
            }
        }
        return false;
    }

    /**
     * Busca um contato pelo documento.
     * @param documento CPF ou CNPJ do contato a ser buscado
     * @return O contato encontrado ou null se não existir
     */
    public Contato buscarContato(String documento) {
        for (Contato contato : contatos) {
            if (contato.getDocumento().equals(documento)) {
                return contato;
            }
        }
        return null;
    }

    /**
     * Retorna a lista de todos os contatos.
     * @return Lista de contatos
     */
    public List<Contato> listarContatos() {
        return new ArrayList<>(contatos);
    }

    /**
     * Cria um novo contato do tipo Pessoa Física.
     * @param nome Nome da pessoa física
     * @param telefone Telefone da pessoa física
     * @param email Email da pessoa física
     * @param cpf CPF da pessoa física
     * @return Nova instância de PessoaFisica ou null se os dados forem inválidos
     */
    public PessoaFisica criarPessoaFisica(String nome, String telefone, String email, String cpf) {
        PessoaFisica pessoa = new PessoaFisica(nome, telefone, email, cpf);
        if (pessoa.validarNome(nome) && pessoa.validarDocumento(cpf)) {
            return pessoa;
        }
        return null;
    }

    /**
     * Cria um novo contato do tipo Pessoa Jurídica.
     * @param nome Nome da pessoa jurídica
     * @param telefone Telefone da pessoa jurídica
     * @param email Email da pessoa jurídica
     * @param cnpj CNPJ da pessoa jurídica
     * @return Nova instância de PessoaJuridica ou null se os dados forem inválidos
     */
    public PessoaJuridica criarPessoaJuridica(String nome, String telefone, String email, String cnpj) {
        PessoaJuridica pessoa = new PessoaJuridica(nome, telefone, email, cnpj);
        if (pessoa.validarNome(nome) && pessoa.validarDocumento(cnpj)) {
            return pessoa;
        }
        return null;
    }
} 