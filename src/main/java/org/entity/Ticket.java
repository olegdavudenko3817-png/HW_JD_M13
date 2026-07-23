package org.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.*;

@Entity
@Table(name = "Ticket")
@Getter
@Setter

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @CreationTimestamp
    @Column(name = "CREATED_AT")
    private Timestamp createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private Client clientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FROM_PLANET_ID", nullable = false)
    private Planet fromPlanetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TO_PLANET_ID", nullable = false)
    private Planet toPlanetId;


    public Ticket() {

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", clientId=" + clientId +
                ", fromPlanetId=" + fromPlanetId +
                ", toPlanetId=" + toPlanetId +
                '}';
    }
}
