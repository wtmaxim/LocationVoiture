package com.example.administrateur.projet.BO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

/**
 * Created by Administrateur on 09/04/2018.
 */

@Entity(tableName = "users")
public class Utilisateur {

    @PrimaryKey
    @ColumnInfo(name = "user_id")
    private String id;

    @ColumnInfo(name = "mail")
    private String nom;

    @ColumnInfo(name = "password")
    private String motDePasse;

    @ColumnInfo(name = "agence_id")
    private String agenceId;

    public Utilisateur() {

    }

    @Ignore
    public Utilisateur(String id, String nom, String motDePasse, String agenceId) {
        this.id = id;
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.agenceId = agenceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAgenceId() { return agenceId; }

    public void setAgenceId(String agenceId) {
        this.agenceId = agenceId;
    }
}
