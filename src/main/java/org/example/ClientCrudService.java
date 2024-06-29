package org.example;

import org.example.app.dao.config.HibernateUtil;
import org.example.app.dao.model.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;

public class ClientCrudService {
    public Client selectClient(int id) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();

        Client client = session.find(Client.class, id);

        session.close();
        return client;
    }

    public int createClient(Client client) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(client);

        transaction.commit();
        session.close();
        return client.getId();
    }

    public String deleteClient(int id) throws SQLException {
        String result;
        try ( Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Client client1 = selectClient(id);
            result = client1.getName();
            session.remove(client1);

            session.flush();
            transaction.commit();
        }
        return result;
    }
}

