package ed01;

import java.util.Random;


public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;


    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1; // número entre 1 e 100
    }


    public String jogar(int tentativa) {
        jogador.incrementarTentativas();

        if (tentativa < numeroSecreto) {
            return "O número secreto é maior.";
        } else if (tentativa > numeroSecreto) {
            return "O número secreto é menor.";
        } else {
            // Acertou! Calcula pontuação proporcional
            int pontos = Math.max(0, 100 - jogador.getTentativas() * 10);
            jogador.atualizarPontuacao(pontos);
            return "Parabéns! Você acertou o número!";
        }
    }
}
