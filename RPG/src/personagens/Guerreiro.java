package personagens;

import enums.ClassePersonagem;

public class Guerreiro extends Personagem {

    private String tipoArma;

    public Guerreiro(String nome,
                     int nivel,
                     int pontosDeVida,
                     String tipoArma) {

        super(nome,
              nivel,
              pontosDeVida,
              ClassePersonagem.GUERREIRO);

        this.tipoArma = tipoArma;
    }

    @Override
    public void atacar() {

        System.out.println(
                getNome() +
                " ataca com " +
                tipoArma +
                "!"
        );
    }

    // SOBRECARGA
    public void atacar(int dano) {

        System.out.println(
                getNome() +
                " ataca causando " +
                dano +
                " de dano!"
        );
    }

    // SOBRECARGA
    public void atacar(int dano, String alvo) {

        System.out.println(
                getNome() +
                " ataca " +
                alvo +
                " causando " +
                dano +
                " de dano!"
        );
    }

    @Override
    public void exibirInfo() {

        super.exibirInfo();

        System.out.println("Arma: " + tipoArma);
    }
}