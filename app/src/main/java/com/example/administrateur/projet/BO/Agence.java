package com.example.administrateur.projet.BO;

public class Agence {
    private int id;
    private String raisonSocial;
    private String siret;
    private String voie;
    private String cp;
    private String vile;

    public Agence() {
    }

    public Agence(int id, String raisonSocial, String siret, String voie, String cp, String vile) {
        this.id = id;
        this.raisonSocial = raisonSocial;
        this.siret = siret;
        this.voie = voie;
        this.cp = cp;
        this.vile = vile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVile() {
        return vile;
    }

    public void setVile(String vile) {
        this.vile = vile;
    }
}
