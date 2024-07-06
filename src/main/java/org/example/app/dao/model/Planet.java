package org.example.app.dao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "Planet")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Planet {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @Pattern(regexp = "[A-Z][0-9]*")
    private String id;

    @Column(name = "name", unique = true, nullable = false, length = 500)
    private String name;

    @OneToMany(mappedBy = "fromPlanet")
    private List<Ticket> ticketFromPlanetList;

    @OneToMany(mappedBy = "toPlanet")
    private List<Ticket> ticketToPlanetList;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public static AssociationOverride builder() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public List<Ticket> getTicketFromPlanetList() {
        return ticketFromPlanetList;
    }

    public void setTicketFromPlanetList(List<Ticket> ticketFromPlanetList) {
        this.ticketFromPlanetList = ticketFromPlanetList;
    }

    public List<Ticket> getTicketToPlanetList() {
        return ticketToPlanetList;
    }

    public void setTicketToPlanetList(List<Ticket> ticketToPlanetList) {
        this.ticketToPlanetList = ticketToPlanetList;
    }
}
