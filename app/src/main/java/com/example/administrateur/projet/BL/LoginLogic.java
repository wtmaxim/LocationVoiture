package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.UtilisateurEngine;

public class LoginLogic {
    private static UtilisateurEngine utilisateurEngine;

    public static Utilisateur Connexion(Utilisateur utilisateur) {
        Utilisateur utilisateurRetour = utilisateurEngine.Connexion(utilisateur);
        return utilisateurRetour;
    }

    public void Inscription(Utilisateur utilisateur) {
        utilisateurEngine.Inscription(utilisateur);
    }
}
