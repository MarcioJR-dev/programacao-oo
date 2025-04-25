package ed01;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();

        boolean continuar = true;

        while (continuar) {
            System.out.print("\nDigite o nome do jogador: ");
            String nome = teclado.nextLine();

            Jogador jogador = new Jogador(nome);
            Jogo jogo = new Jogo(jogador);

            boolean acertou = false;

            System.out.println("\nAdivinhe o número secreto entre 1 e 100!");

            while (!acertou) {
                System.out.print("Digite sua tentativa: ");
                int tentativa = teclado.nextInt();
                teclado.nextLine(); // Limpa buffer

                String resultado = jogo.jogar(tentativa);
                System.out.println(resultado);

                if (resultado.contains("Parabéns")) {
                    acertou = true;
                }
            }

            System.out.println("\n🎯 Total de tentativas: " + jogador.getTentativas());
            System.out.println("✨ Pontuação final: " + jogador.getPontuacao());

            placar.adicionarJogador(jogador);

            System.out.print("\nDeseja adicionar outro jogador? (s/n): ");
            String resposta = teclado.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Mostra o ranking final
        placar.mostrarRanking();
        teclado.close();
    }
}
