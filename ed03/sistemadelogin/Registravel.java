/**
 * Interface que define o comportamento de objetos que podem registrar logs.
 */
public interface Registravel {
    /**
     * Registra uma operação no log de auditoria.
     * @param operacao Operação a ser registrada
     */
    void registrarOperacao(String operacao);
} 