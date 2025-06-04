package ED3.grafico_online;

/**
 * Classe que representa um documento de texto.
 */
public class TextDocument implements Printable {
    private String title;
    private String content;

    /**
     * Construtor da classe TextDocument.
     * @param title Título do documento
     * @param content Conteúdo do documento
     */
    public TextDocument(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * Exibe o título em maiúsculas seguido do conteúdo do documento.
     */
    @Override
    public void print() {
        System.out.println(title.toUpperCase());
        System.out.println(content);
        System.out.println();
    }
}
