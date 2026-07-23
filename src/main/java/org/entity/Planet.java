package org.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Planet")
@Getter
@Setter

public class Planet {

    @Id
    @Column(name = "id")
    String id;
    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "fromPlanetId")
    private List<Ticket> ticketsFrom = new ArrayList<>();

    @OneToMany(mappedBy = "toPlanetId")
    private List<Ticket> ticketsTo = new ArrayList<>();

    public Planet() {
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

