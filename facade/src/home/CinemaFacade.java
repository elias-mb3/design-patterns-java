package facade.src.home;

public class CinemaFacade {
    private TV tv;
    private Som som;
    private Luz luz;

    public CinemaFacade() {
        this.tv = new TV();
        this.som = new Som();
        this.luz = new Luz();
    }

    public void assistirFilme() {
        luz.apagar();
        tv.ligar();
        som.ligar();
        System.out.println("Tudo pronto para o filme! 🍿");
    }
}
