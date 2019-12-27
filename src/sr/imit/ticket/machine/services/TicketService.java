package sr.imit.ticket.machine.services;

import sr.imit.ticket.machine.model.Film;
import sr.imit.ticket.machine.model.Ticket;

import java.util.List;

public class TicketService {
    public final String BIOSCOOP_TBL = "TBL Cinemas";
    public final String BIOSCOOP_TOWER = "Theater Tower";
    public final String BIOSCOOP_STAR = "Theater Star";
    public List<Film> filmLijst;
    private static int counter = 0;

    public TicketService(List<Film> filmLijst) {
        this.filmLijst = filmLijst;
    }

    public Ticket generateTicket(String bioscoop, Film film) {
        Double price;
        if (film.getDrieDimensionaal()) {
            price = 32.50;
        } else {
            price = 25.00;
        }
        return new Ticket(bioscoop, film.getNaam(), price, ++counter, film.getZaal());
    }

}
