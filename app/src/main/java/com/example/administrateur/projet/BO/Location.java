package com.example.administrateur.projet.BO;

import java.util.Date;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class Location {
    private int id;
    private Vehicule vehicule;
    private Agence agence;
    private Date dateDebut;
    private Date dateFin;
    private float tarif;


    public Location() {
    }

    public Location(int id, Vehicule vehicule, Date dateDebut, Date dateFin, float tarif) {
        this.id = id;
        this.vehicule = vehicule;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.tarif = tarif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
