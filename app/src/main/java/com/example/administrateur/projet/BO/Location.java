package com.example.administrateur.projet.BO;

import java.util.Date;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class Location {
    private int id;
    private Date dateDebut;
    private Date dateFin;
    private float tarif;
    private String agenceId;
    private String vehiculeId;


    public Location() {
    }

    public Location(int id, Date dateDebut, Date dateFin, float tarif, String agenceId, String vehiculeId) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.tarif = tarif;
        this.agenceId = agenceId;
        this.vehiculeId = vehiculeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(String agenceId) {
        this.agenceId = agenceId;
    }

    public String getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(String vehiculeId) {
        this.vehiculeId = vehiculeId;
    }
}
