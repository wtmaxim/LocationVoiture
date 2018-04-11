package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurBouchon {

    private static List<Utilisateur> utilisateurList = new ArrayList<>();

    public static List<Utilisateur> getUtilisateurList() {
        utilisateurList.add(new Utilisateur(1, "Jean", "Jean", AgenceBouchon.getAgence(1)));
        utilisateurList.add(new Utilisateur(2, "Admin", "Admin", AgenceBouchon.getAgence(2)));
        return utilisateurList;
    }


}
