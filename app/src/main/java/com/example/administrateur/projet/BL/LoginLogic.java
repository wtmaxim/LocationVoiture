package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.UtilisateurEngine;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginLogic {
    private static UtilisateurEngine utilisateurEngine;

    public static Utilisateur Connexion(Utilisateur utilisateur) {
        return utilisateurEngine.getUtilisateur(utilisateur);
    }

    public static void Inscription(Utilisateur utilisateur) {
        utilisateurEngine.insert(utilisateur);
    }

    public static Utilisateur getUtilisateurById(int id) {
        return utilisateurEngine.getUtilisateurById(id);
    }

    public static JSONObject boToJson(Utilisateur utilisateur) {
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("mail", utilisateur.getNom());
            jsonObject.put("password", utilisateur.getMotDePasse());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
