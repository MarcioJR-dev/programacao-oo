package ed01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Placar {
    private ArrayList<Jogador> ranking;


    public Placar() {
        this.ranking = new ArrayList<>();
    }


    public void adicionarJogador(Jogador j) {
        ranking.add(j);
    }


    public void mostrarRanking() {
        // Ordena o ranking por pontuação (do maior para o menor)
        ranking.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());

        System.out.println("\n🏆 Ranking de Jogadores:");
        for (Jogador j : ranking) {
            System.out.println("- " + j.getNome() + " | Pontuação: " + j.getPontuacao());
        }
    }
}
