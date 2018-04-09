package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Utilisateur;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class LoginBouchon {

    public LoginBouchon() {
    }

    public Utilisateur getOneUser(Utilisateur utilisateur) {
        Utilisateur utilisateurBouchon = new Utilisateur();
        utilisateurBouchon.setNom("admin");
        utilisateurBouchon.setMotDePasse("admin");

        if (utilisateur == utilisateurBouchon) {
            return utilisateur;
        }
        return null;
    }
}
