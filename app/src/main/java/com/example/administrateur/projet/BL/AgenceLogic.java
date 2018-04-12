package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.AgenceEngine;
import com.example.administrateur.projet.DAL.UtilisateurEngine;

public class AgenceLogic {
    private static AgenceEngine agenceEngine;

    public static Agence getAgencebyId(int id) {
        return agenceEngine.getAgenceById(id);
    }

    public static void setAgences() {
        agenceEngine.setAgence();
    }

    public static void update(Agence agence) {
        agenceEngine.update(agence);
    }
}
