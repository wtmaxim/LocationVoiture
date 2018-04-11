package com.example.administrateur.projet.DAL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Bouchon.UtilisateurBouchon;

public class UtilisateurEngine {

    public UtilisateurEngine() {

    }

    public static Utilisateur Connexion(Utilisateur utilisateur) {
        UtilisateurBouchon utilisateurBouchon = new UtilisateurBouchon();
        return utilisateurBouchon.getOneUser(utilisateur);
    }

    public static Utilisateur getUtilisateur(int id) {
        UtilisateurBouchon utilisateurBouchon = new UtilisateurBouchon();
        return utilisateurBouchon.getOneUser(utilisateur);
    }

    public void Inscription(Utilisateur utilisateur) {

    }
}
