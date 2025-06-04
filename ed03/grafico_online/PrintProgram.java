package ED3.grafico_online;

/**
 * Classe principal que demonstra o funcionamento do sistema de impressão.
 */
public class PrintProgram {
    /**
     * Método principal que cria e testa diferentes tipos de objetos imprimíveis.
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Criando um documento de texto
        TextDocument doc = new TextDocument("Documento de Apresentação", 
            "Este é o conteúdo do documento.");
        
        // Criando uma imagem digital
        DigitalImage img = new DigitalImage("paisagem.jpg", "1920x1080");
        
        // Criando um gráfico estatístico
        StatisticalChart chart = new StatisticalChart("Distribuição de Vendas", "barra");
        
        // Criando um relatório PDF
        PdfReport report = new PdfReport("João Silva", 12);

        // Imprimindo cada objeto
        doc.print();
        img.print();
        chart.print();
        report.print();
    }
}
