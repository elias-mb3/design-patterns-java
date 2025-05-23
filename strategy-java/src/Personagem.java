import strategy.EstrategiaDeMovimento;

public class Personagem {
    private EstrategiaDeMovimento estrategia;

    public void setEstrategia(EstrategiaDeMovimento estrategia) {
        this.estrategia = estrategia;
    }

    public void mover() {
        if (estrategia != null) {
            estrategia.mover();
        } else {
            System.out.println("Nenhuma estratégia definida!");
        }
    }
}
