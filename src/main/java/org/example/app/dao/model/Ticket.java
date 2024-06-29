package org.example.app.dao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "Ticket")
@Entity
@Data
public class Ticket {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "from_planet_id")
    private String fromPlanetId;

    @Column(name = "to_planet_id")
    private String toPlanetId;


}

