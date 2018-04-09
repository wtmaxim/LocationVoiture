package com.example.administrateur.projet.DAL;

import com.example.administrateur.projet.BO.Utilisateur;

/**
 * Created by Administrateur on 09/04/2018.
 */

interface ILogin {
    void Connexion(String nom, String motDePasse);
    void Inscription(Utilisateur utilisateur);
}
