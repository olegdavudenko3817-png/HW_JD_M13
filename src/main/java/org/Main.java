package org;

import org.crud.ClientCrudServiceImp;
import org.crud.PlanetCrudServiceImp;
import org.crud.TicketCrudServiceImp;
import org.dao.Service.ClientDaoServiceImp;
import org.dao.Service.PlanetDaoServiceImp;
import org.dao.Service.TicketDaoServiceImp;
import org.entity.Client;
import org.entity.Planet;
import org.entity.Ticket;
import org.flywaydb.core.Flyway;

import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) {

        migrateDatabase();

        // Services
        ClientCrudServiceImp clientService =
                new ClientCrudServiceImp(new ClientDaoServiceImp());

        PlanetCrudServiceImp planetService =
                new PlanetCrudServiceImp(new PlanetDaoServiceImp());

        TicketCrudServiceImp ticketService =
                new TicketCrudServiceImp(new TicketDaoServiceImp());

        // Client
        Client client = new Client();
        client.setId(150);
        client.setName("Dima");

        clientService.add(client);

        // Planets
        Planet mars = new Planet();
        mars.setId("MARS1");
        mars.setName("Mars");

        Planet saturn = new Planet();
        saturn.setId("SAT23");
        saturn.setName("Saturn");

        Planet uranus = new Planet();
        uranus.setId("URAN77");
        uranus.setName("Uranus");

        planetService.add(mars);
        planetService.add(saturn);
        planetService.add(uranus);

        // Ticket
        Ticket ticket = new Ticket();
        ticket.setClientId(client);
        ticket.setCreatedAt(Timestamp.valueOf("2026-12-12 12:12:12"));
        ticket.setFromPlanetId(saturn);
        ticket.setToPlanetId(uranus);

        ticketService.add(ticket);

        // Delete entities
        ticketService.delete(ticket);

        planetService.delete(mars);
        planetService.delete(saturn);
        planetService.delete(uranus);

        clientService.delete(client);
    }

    private static void migrateDatabase() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:file:./h2db/test", "SA", null)
                .locations("filesystem:src/main/resources/db/migration")
                .load();

        flyway.migrate();
    }
}