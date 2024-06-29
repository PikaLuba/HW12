package org.example.app.dao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Client")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Client {

    public static AssociationOverride builder() {
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column
    private String name;
}


