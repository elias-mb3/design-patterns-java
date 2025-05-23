import strategy.*;
 
public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();

        jogador.setEstrategia(new Correr());
        jogador.mover(); // Correndo!

        jogador.setEstrategia(new AndarBicicleta());
        jogador.mover(); // Andando de bicicleta!

        jogador.setEstrategia(new DirigirCarro());
        jogador.mover(); // Dirigindo um carro!
    }
}
