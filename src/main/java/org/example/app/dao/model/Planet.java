package org.example.app.dao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Planet")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Planet {

    @Id
    private String id;
    @Column(name = "name", unique = true, nullable = false, length = 500)
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }



    public String getName() {
        return name;
    }



}
