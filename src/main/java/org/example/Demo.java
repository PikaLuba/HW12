package org.example;

import org.example.app.dao.model.Client;
import org.example.app.dao.model.Planet;
import org.example.databaseService.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws SQLException {
      //flyway
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

    }
}