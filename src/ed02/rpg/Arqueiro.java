/**
 * Subclasse que representa um arqueiro.
 */
public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 90, 18);
    }

    @Override
    public void atacar(Personagem inimigo) {
        if (Math.random() < 0.3) { // 30% de chance de ataque crítico
            inimigo.defender(ataqueBase * 2);
        } else {
            inimigo.defender(ataqueBase);
        }
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Chuva de Flechas!");
    }
} 