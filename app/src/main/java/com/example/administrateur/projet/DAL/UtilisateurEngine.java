package com.example.administrateur.projet.DAL;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Bouchon.UtilisateurBouchon;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface UtilisateurEngine {
/*
    @Insert
    void insert(Utilisateur utilisateur);

    @Query("SELECT * FROM utilisateur WHERE mail = (:mail) AND password = (:password) LIMIT 1")
    Utilisateur getById(String mail, String password);
*/
    /*public static Utilisateur getUtilisateur(Utilisateur utilisateur) {
        List<Utilisateur> utilisateurList = UtilisateurBouchon.getUtilisateurList();

        for (Utilisateur item : utilisateurList) {
            if(item.getNom().equals(utilisateur.getNom())
                    && item.getMotDePasse().equals(utilisateur.getMotDePasse())) {
                return item;
            }
        }
        return null;
    }

    public static Utilisateur getUtilisateurById(int id) {
        List<Utilisateur> utilisateurList = UtilisateurBouchon.getUtilisateurList();

        for (Utilisateur item : utilisateurList) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }

    public static void insert(Utilisateur utilisateur) {
       UtilisateurBouchon.getUtilisateurList().add(utilisateur);
    }*/
}
