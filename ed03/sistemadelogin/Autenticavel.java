/**
 * Interface que define o comportamento de objetos que podem ser autenticados.
 */
public interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida.
     * @param senha Senha a ser verificada
     * @return boolean - true se a senha for válida, false caso contrário
     */
    boolean autenticar(String senha);
} 