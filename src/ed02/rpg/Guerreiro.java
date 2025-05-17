package ed02.rpg;

/**
 * Subclasse que representa um guerreiro.
 */
public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 100, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase * 2); // Ataque físico forte
    }

    @Override
    public void defender(int dano) {
        hp -= dano / 2; // Reduz dano recebido pela metade
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Golpe Duplo!");
    }
} 