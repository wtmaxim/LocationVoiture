package com.example.administrateur.projet.DAL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Bouchon.UtilisateurBouchon;

import java.util.List;

public class UtilisateurEngine {


    public UtilisateurEngine() {

    }


    public static Utilisateur getUtilisateur(Utilisateur utilisateur) {
        List<Utilisateur> utilisateurList = UtilisateurBouchon.getUtilisateurList();

        for (Utilisateur item : utilisateurList) {
            if(item.getNom().equals(utilisateur.getNom())
                    && item.getMotDePasse().equals(utilisateur.getMotDePasse())) {
                return item;
            }
        }
        return null;
    }

    public void Inscription(Utilisateur utilisateur) {

    }

    private static void Insert(Utilisateur utilisateur) {
       // utilisateurList.add(utilisateur);
    }
}
