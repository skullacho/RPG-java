import personagens.Guerreiro;

public class Main {

    public static void main(String[] args) {

        Guerreiro g1 =
                new Guerreiro(
                        "Arthur",
                        10,
                        150,
                        "Espada"
                );

        Guerreiro g2 =
                new Guerreiro(
                        "Leon",
                        8,
                        120,
                        "Machado"
                );

        // EXIBIR INFO
        g1.exibirInfo();

        System.out.println();

        // METODOS
        g1.atacar();

        g1.atacar(50);

        g1.atacar(80, "Dragao");

        System.out.println();

        // COMPARACAO
        if (g1.getPontosDeVida() >
                g2.getPontosDeVida()) {

            System.out.println(
                    g1.getNome() +
                    " esta em melhor estado!"
            );

        } else {

            System.out.println(
                    g2.getNome() +
                    " esta em melhor estado!"
            );
        }
    }
}