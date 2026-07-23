package org.crud;


import org.dao.Service.TicketDaoService;
import org.entity.Ticket;

public class TicketCrudServiceImp implements TicketCrudService {

    private TicketDaoService ticketDaoService;

    public TicketCrudServiceImp(TicketDaoService ticketDaoService) {
        this.ticketDaoService = ticketDaoService;
    }

    @Override
    public void add(Ticket ticket) {

        if (ticket == null) {
            throw new IllegalArgumentException("Ticket is null");
        }

        if (ticket.getClientId() == null) {
            throw new IllegalArgumentException("Client is null");
        }

        if (ticket.getFromPlanetId() == null) {
            throw new IllegalArgumentException("From planet is null");
        }

        if (ticket.getToPlanetId() == null) {
            throw new IllegalArgumentException("To planet is null");
        }

        ticketDaoService.add(ticket);
    }

    @Override
    public void delete(Ticket ticket) {
        ticketDaoService.delete(ticket);
    }
}
