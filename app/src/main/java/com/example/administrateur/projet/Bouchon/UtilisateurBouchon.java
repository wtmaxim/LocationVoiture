package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.BO.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurBouchon {

    private static List<Utilisateur> utilisateurList = new ArrayList<>();

    public static List<Utilisateur> getUtilisateurList() {
        utilisateurList.add(new Utilisateur(1, "Jean", "Jean", 1));
        utilisateurList.add(new Utilisateur(2, "Admin", "Admin", 2));
        return utilisateurList;
    }


}