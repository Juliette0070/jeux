package com.polytech.jeux.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int utilisateur_id;
    private int jeux_id;
    private int reservation;
    private LocalDateTime date_debut;
    private LocalDateTime date_fin;
}
