package ED3.grafico_online;

/**
 * Classe que representa um gráfico estatístico.
 */
public class StatisticalChart implements Printable {
    private String title;
    private String chartType;

    /**
     * Construtor da classe StatisticalChart.
     * @param title Título do gráfico
     * @param chartType Tipo do gráfico (ex: "pizza", "barra")
     */
    public StatisticalChart(String title, String chartType) {
        this.title = title;
        this.chartType = chartType;
    }

    /**
     * Exibe o tipo do gráfico seguido do título em caixa alta.
     */
    @Override
    public void print() {
        System.out.println("Gráfico do tipo: " + chartType.toUpperCase());
        System.out.println("Título: " + title.toUpperCase());
        System.out.println();
    }
}
