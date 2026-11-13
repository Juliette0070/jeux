package com.polytech.jeux.entity;

import jakarta.persistence.*;

@Entity
@Table(name="coordonnees")
public class Coordonnees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String latitude;
    private String longitude;
    private int jeux_id;
}
