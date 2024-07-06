package org.example;

import org.example.app.dao.model.Client;
import org.example.app.dao.model.Planet;
import org.example.app.dao.model.Ticket;
import org.example.databaseService.DataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) throws SQLException {
      // flyway
        DataSource dataSource = DataSource.getInstance();
        Connection connection = dataSource.getConnection();

        // Client
        ClientCrudService clientCrudService = new ClientCrudService();

        Client newClient1 = new Client();
        newClient1.setName("Leyla");
        int result = clientCrudService.createClient(newClient1);
        System.out.println("1. INSERT client Name = Leyla : Id = " + result);

        Client newClient2 = clientCrudService.selectClient(result);
        System.out.println("2. SELECT client = " + newClient2.getId() + " " + newClient2.getName());

        String newResult = clientCrudService.deleteClient(result);
        System.out.println("3. DELETE client id = " + result + " name = " + newResult);

        // Planet
        PlanetCrudService planetCrudService = new PlanetCrudService();

        Planet newPlanet1 = new Planet();
        newPlanet1.setId("URANUS");
        newPlanet1.setName("Uranus");
        String result2 = planetCrudService.createPlanet(newPlanet1);
        System.out.println("1. INSERT planet Name = Uranus : Id = " + result2);

        Planet newPlanet2 = planetCrudService.selectPlanet(result2);
        System.out.println("2. SELECT planet = " + newPlanet2);

        String newResult2 = planetCrudService.deletePlanet(result2);
        System.out.println("3. DELETE planet id = " + result2 + " name = " + newResult2);

        // Ticket
        TicketCrudService ticketCrudService = new TicketCrudService();
//////
        Integer idClient = 5;
        Ticket newTicket = new Ticket();
        newTicket.setName("1. klasse");

        Planet fromPlanet = new Planet();
        fromPlanet.setId("EARTH");
        newTicket.setFromPlanet(fromPlanet);

        Planet toPlanet = new Planet();
        toPlanet.setId("MARS");
        newTicket.setToPlanet(toPlanet);

        newTicket.setCreatedAt(LocalDateTime.now());
        Ticket ticket = ticketCrudService.createTicketForClient(idClient, newTicket);
        System.out.println("1. INSERT TICKET FOR ID_CLIENT= " + idClient +  "   CreatedAt = " + ticket.getCreatedAt() + "   name = " + ticket.getName()+ " fromPlanet = " + ticket.getFromPlanet().getId() + " toPlanet = " + ticket.getToPlanet().getId());
/////
        Integer idTicket = 3;
        Ticket ticket1 = ticketCrudService.GetTicketForTicketId(idTicket);
        System.out.println("2. GET TICKET FOR TICKET_id = " + idTicket + ":   createdAt = " + ticket1.getCreatedAt() + " name = " + ticket1.getName() + " fromPlanet = " + ticket1.getFromPlanet().getId() + " toPlanet = " + ticket1.getToPlanet().getId());
/////
        Integer idTicket2 = 1;
        Client client3 = ticketCrudService.getAllTicketsForTicket(idTicket2);
        System.out.println("3. GET ALL TICKETS FOR TICKET_id = " + idTicket2 + " client.getid() = " + client3.getId() + "   client.getName() = " + client3.getName());
        for (Ticket ticket2 : client3.getTicketList()) {
            System.out.println("   client.getName() = " + client3.getName() + "   ticket.createdAt = " + ticket2.getCreatedAt() + " ticket.name = " + ticket2.getName()+ " fromPlanet = " + ticket2.getFromPlanet().getId() + " toPlanet = " + ticket2.getToPlanet().getId());
        }
/////
        Integer idClient4 = 5;
        Client client4 = ticketCrudService.getAllTicketsForClient(idClient4);
        System.out.println("4. GET ALL TICKETS FOR ID_CLIENT = " + idClient4 + " : client.getid() = " + client4.getId() + "   client.getName() = " + client4.getName());
        for (Ticket ticket4 : client4.getTicketList()) {
            System.out.println("   client.getName() = " + client4.getName() + "   createdAt = " + ticket4.getCreatedAt() + " name = " + ticket4.getName()+ " fromPlanet = " + ticket4.getFromPlanet().getId() + " toPlanet = " + ticket4.getToPlanet().getId());
        }
/////
       Integer idTicket5 = 6;
        ticketCrudService.deleteTicketForTicketId(idTicket5);
        System.out.println("5. DELETE TICKET FOR TICKET_id = " + idTicket5);
/////
        Integer idClient3 = 5;
        ticketCrudService.deleteAllTicketsForClientId(idClient3);
        System.out.println("6. DELETE ALL TICKETS FOR CLIENT_id = " + idClient3);

    }
}