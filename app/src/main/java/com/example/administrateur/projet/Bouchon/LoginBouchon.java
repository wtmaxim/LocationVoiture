package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class LoginBouchon {

    private static List<Utilisateur> utilisateurList = new ArrayList<>();

    private static List<Utilisateur> getUtilisateurList() {
        utilisateurList.add(new Utilisateur(1, "Jean", "Jean"));
        utilisateurList.add(new Utilisateur(2, "Admin", "Admin"));
        return utilisateurList;
    }

    public static Utilisateur getOneUser(Utilisateur utilisateur) {
        List<Utilisateur> utilisateurList = getUtilisateurList();
        Utilisateur utilisateurRetour;

        for (Utilisateur item : utilisateurList) {
            if(utilisateurList.contains(item)) {
                utilisateurRetour = item;
                return utilisateurRetour;
            }
        }
        return null;
    }
}
