package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class AgenceBouchon {

    private static List<Agence> agences = new ArrayList<>();

    public static void setAgences() {
        agences.add(new Agence(1, "Agence1", "198DJDKC", "5 rue du pommier", "44000", "Nantes"));
        agences.add(new Agence(2, "Agence2", "54JHD54", "6 rue du pommier", "44000", "Nantes"));
        //return agences;
    }

    public static  List<Agence> getAgencesList() {
        return agences;
    }

}
