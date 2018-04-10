package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.LoginEngine;

public class LoginLogic {
    private LoginEngine loginEngine;

    public void Connexion(Utilisateur utilisateur) {
        Utilisateur utilisateurRetour = loginEngine.Connexion(utilisateur);
    }

    public void Inscription(Utilisateur utilisateur) {
        loginEngine.Inscription(utilisateur);
    }
}
