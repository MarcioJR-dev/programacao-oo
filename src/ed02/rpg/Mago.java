/**
 * Subclasse que representa um mago.
 */
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 15);
    }

    @Override
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase); // Ataque mágico
    }

    @Override
    public void defender(int dano) {
        hp -= dano; // Defesa fraca
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Bola de Fogo!");
    }
} 