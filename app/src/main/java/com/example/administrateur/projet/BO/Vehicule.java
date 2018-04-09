package com.example.administrateur.projet.BO;

public class Vehicule {
    private int id;
    private String modele;
    private String marque;
    private boolean estLoue;

    public Vehicule() {
    }

    public Vehicule(int id, String modele, String marque, boolean estLoue) {
        this.id = id;
        this.modele = modele;
        this.marque = marque;
        this.estLoue = estLoue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean isEstLoue() {
        return estLoue;
    }

    public void setEstLoue(boolean estLoue) {
        this.estLoue = estLoue;
    }
}
