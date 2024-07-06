package org.example;

import org.example.app.dao.config.HibernateUtil;
import org.example.app.dao.model.Client;
import org.example.app.dao.model.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketCrudService {

    public Ticket GetTicketForTicketId(Integer idTicket) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();

        Ticket ticket = session.get(Ticket.class, idTicket);
        Client client = ticket.getClient();

        session.close();
        return ticket;
    }

    public Client getAllTicketsForClient(Integer idClient) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();

        Client client = session.get(Client.class, idClient);
        for (Ticket ticket1:client.getTicketList()) {
            //
        }

        session.close();
        return client;
    }



    public Client getAllTicketsForTicket(int idTicket) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();

        Ticket ticket = session.get(Ticket.class, idTicket);
        Client client = ticket.getClient();
        for (Ticket ticket1:client.getTicketList()) {
           //
        }

        session.close();
        return client;
    }

    public Ticket createTicketForClient(Integer idClient, Ticket ticket) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Client client = session.get(Client.class, idClient);
        ticket.setClient(client);
        client.setTicketList(Arrays.asList(ticket));

        session.persist(ticket);
        session.persist(client);
        session.close();
        return ticket;
    }

    public void deleteTicketForTicketId(Integer idTicket) throws SQLException {
        try ( Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Ticket ticket1 = new Ticket();
            ticket1 = (Ticket) session.get(Ticket.class, idTicket);
            session.remove(ticket1);
            session.flush();
            transaction.commit();
        }
    }

    public void deleteAllTicketsForClientId(Integer idClient) throws SQLException {

        try ( Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Client client = session.get(Client.class, idClient);
            for (Ticket ticket1 : client.getTicketList()) {
                session.remove(ticket1);
            }

            session.flush();
            transaction.commit();

        }

    }


}
