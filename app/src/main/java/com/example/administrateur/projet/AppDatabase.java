package com.example.administrateur.projet;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.UtilisateurEngine;

/**
 * Created by Administrateur on 12/04/2018.
 */

@Database(entities = {Utilisateur.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UtilisateurEngine utilisateurEngine();
}

