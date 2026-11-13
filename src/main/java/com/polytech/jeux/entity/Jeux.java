package com.polytech.jeux.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jeux")
public class Jeux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int quantite;
    private String description;
}
