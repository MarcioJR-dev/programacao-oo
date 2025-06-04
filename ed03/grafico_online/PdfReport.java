package ED3.grafico_online;

/**
 * Classe que representa um relatório em PDF.
 */
public class PdfReport implements Printable {
    private String author;
    private int pageCount;

    /**
     * Construtor da classe PdfReport.
     * @param author Autor do relatório
     * @param pageCount Número de páginas do relatório
     */
    public PdfReport(String author, int pageCount) {
        this.author = author;
        this.pageCount = pageCount;
    }

    /**
     * Exibe o nome do autor e o número total de páginas.
     */
    @Override
    public void print() {
        System.out.println("Autor: " + author);
        System.out.println("Total de páginas: " + pageCount);
        System.out.println();
    }
}
