package com.example.administrateur.projet.BO;

public class Vehicule {
    private int id;
    private String libelle;
    private int nbPlaces;
    private float dureeMax;
    private float dureeMin;
    private float tariffMin;
    private float tarifMax;
    private boolean estLoue;

    public Vehicule() {
    }

    public Vehicule(int id, String libelle, int nbPlaces, float dureeMax, float dureeMin, float tariffMin, float tarifMax, boolean estLoue) {
        this.id = id;
        this.libelle = libelle;
        this.nbPlaces = nbPlaces;
        this.dureeMax = dureeMax;
        this.dureeMin = dureeMin;
        this.tariffMin = tariffMin;
        this.tarifMax = tarifMax;
        this.estLoue = estLoue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public float getDureeMax() {
        return dureeMax;
    }

    public void setDureeMax(float dureeMax) {
        this.dureeMax = dureeMax;
    }

    public float getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(float dureeMin) {
        this.dureeMin = dureeMin;
    }

    public float getTariffMin() {
        return tariffMin;
    }

    public void setTariffMin(float tariffMin) {
        this.tariffMin = tariffMin;
    }

    public float getTarifMax() {
        return tarifMax;
    }

    public void setTarifMax(float tarifMax) {
        this.tarifMax = tarifMax;
    }

    public boolean isEstLoue() {
        return estLoue;
    }

    public void setEstLoue(boolean estLoue) {
        this.estLoue = estLoue;
    }
}
