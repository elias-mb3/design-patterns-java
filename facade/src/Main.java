package facade.src;

import facade.src.home.CinemaFacade;

public class Main {
    public static void main(String[] args) {
        CinemaFacade cinema = new CinemaFacade();
        cinema.assistirFilme();
    }
}
