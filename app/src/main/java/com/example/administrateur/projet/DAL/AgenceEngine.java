package com.example.administrateur.projet.DAL;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Bouchon.AgenceBouchon;
import com.example.administrateur.projet.Bouchon.UtilisateurBouchon;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Administrateur on 11/04/2018.
 */

public class AgenceEngine {

    public static void update(Agence agence) {
        int position = -1;
        List<Agence> agences = AgenceBouchon.getAgencesList();
        for (int i = 0; i<agences.size(); i++) {
            if (agences.get(i).getId() == agence.getId()) {
                position = i;
                break;
            }
        }
        AgenceBouchon.getAgencesList().set(position, agence);
    }

    public static void setAgence() {
        AgenceBouchon.setAgences();
    }

    public static Agence getAgenceById(int id) {
        List<Agence> agences = AgenceBouchon.getAgencesList();

        for (Agence item : agences) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }
}
