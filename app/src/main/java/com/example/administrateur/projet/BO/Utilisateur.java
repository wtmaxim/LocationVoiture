package com.example.administrateur.projet.BO;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class Utilisateur {
    private String nom;
    private String motDePasse;

    public Utilisateur() {

    }

    public Utilisateur(String nom, String motDePasse) {
        this.nom = nom;
        this.motDePasse = motDePasse;
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
}
