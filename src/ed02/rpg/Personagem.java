/**
 * Classe base para representar um personagem de RPG.
 */
public class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
    }

    public void defender(int dano) {
        hp -= dano;
    }

    public void usarHabilidadeEspecial() {
        // Método a ser sobrescrito pelas subclasses
    }

    public void status() {
        System.out.println("Nome: " + nome + ", HP: " + hp + ", Ataque Base: " + ataqueBase);
    }
} 