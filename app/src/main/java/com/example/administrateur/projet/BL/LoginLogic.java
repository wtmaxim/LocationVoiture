package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.UtilisateurEngine;

public class LoginLogic {
    private static UtilisateurEngine utilisateurEngine;

    public static Utilisateur Connexion(Utilisateur utilisateur) {
        return utilisateurEngine.getUtilisateur(utilisateur);
    }

    public void Inscription(Utilisateur utilisateur) {
        utilisateurEngine.Inscription(utilisateur);
    }
}
