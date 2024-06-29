package org.example;

import org.example.app.dao.config.HibernateUtil;
import org.example.app.dao.model.Planet;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;

public class PlanetCrudService {
    public Planet selectPlanet(String id) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();

        Planet planet = session.find(Planet.class, id);

        session.close();
        return planet;
    }

    public String createPlanet(Planet planet) throws SQLException {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(planet);

        transaction.commit();
        session.close();
        return planet.getId();
    }

    public String deletePlanet(String id) throws SQLException {
        String result;
        try ( Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Planet planet1 = selectPlanet(id);
            result = planet1.getName();
            session.remove(planet1);

            session.flush();
            transaction.commit();
        }
        return result;
    }
}

