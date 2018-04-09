package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Utilisateur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class LoginBouchon {

    private List<Utilisateur> utilisateurList = new ArrayList<>();

    public LoginBouchon() {
    }

    private List<Utilisateur> getUtilisateurList() {
        utilisateurList.add(new Utilisateur("Jean", "Jean"));
        utilisateurList.add(new Utilisateur("Admin", "Admin"));
        return utilisateurList;
    }

    public Utilisateur getOneUser(Utilisateur utilisateur) {
        List<Utilisateur> utilisateurList = getUtilisateurList();

        if (utilisateurList.contains(utilisateur)) {
            return utilisateur;
        }
        return null;
    }
}
