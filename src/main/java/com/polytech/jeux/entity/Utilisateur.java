package com.polytech.jeux.entity;

import jakarta.persistence.*;

@Entity
@Table(name="utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String password;
    private String username;
}
