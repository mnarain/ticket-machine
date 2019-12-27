package sr.imit.ticket.machine.services;

import sr.imit.ticket.machine.model.Film;
import sr.imit.ticket.machine.model.Order;
import sr.imit.ticket.machine.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketMachineService {
    private TicketService ticketService;

    public TicketMachineService() {
        this.ticketService = new TicketService(new ArrayList<Film>());
    }

    public List<Film> generateFilmLijst() {
        return null;
    }

    public List<Ticket> placeOrder(List<Order> orders) {

        for (Order order : orders) {

        }


        return null;
    }


}
