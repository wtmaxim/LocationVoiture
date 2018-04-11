package com.example.administrateur.projet.BO;

import java.io.Serializable;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class Utilisateur {
    private int id;
    private String nom;
    private String motDePasse;
    Agence agence;

    public Utilisateur() {

    }

    public Utilisateur(int id, String nom, String motDePasse, Agence agence) {
        this.id = id;
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.agence = agence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", agence=" + agence +
                '}';
    }
}
