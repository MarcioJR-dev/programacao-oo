package ED3.grafico_online;

/**
 * Classe que representa uma imagem digital.
 */
public class DigitalImage implements Printable {
    private String fileName;
    private String resolution;

    /**
     * Construtor da classe DigitalImage.
     * @param fileName Nome do arquivo da imagem
     * @param resolution Resolução da imagem
     */
    public DigitalImage(String fileName, String resolution) {
        this.fileName = fileName;
        this.resolution = resolution;
    }

    /**
     * Exibe o nome do arquivo e sua resolução.
     */
    @Override
    public void print() {
        System.out.println("Arquivo: " + fileName);
        System.out.println("Resolução: " + resolution);
        System.out.println();
    }
}
