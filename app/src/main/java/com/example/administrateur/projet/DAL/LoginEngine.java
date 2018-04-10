package com.example.administrateur.projet.DAL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Bouchon.LoginBouchon;

public class LoginEngine {

    public LoginEngine() {

    }

    public Utilisateur Connexion(Utilisateur utilisateur) {
        LoginBouchon loginBouchon = new LoginBouchon();
        return loginBouchon.getOneUser(utilisateur);
    }

    public void Inscription(Utilisateur utilisateur) {

    }
}
