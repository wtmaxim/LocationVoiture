package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.UtilisateurEngine;

public class LoginLogic {
    private static UtilisateurEngine utilisateurEngine;

    public static Utilisateur Connexion(Utilisateur utilisateur) {
        //return utilisateurEngine.getUtilisateur(utilisateur);
        return null;
    }

    public static void Inscription(Utilisateur utilisateur) {
        //utilisateurEngine.insert(utilisateur);
    }

    public static Utilisateur getUtilisateurById(int id) {
        //return utilisateurEngine.getUtilisateurById(id);
        return null;
    }
}
