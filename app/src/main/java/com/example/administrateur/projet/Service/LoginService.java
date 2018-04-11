package com.example.administrateur.projet.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.DAL.UtilisateurEngine;

public class LoginService extends Service {
    private IBinder binder;

    public class LoginServiceBinder extends Binder {
        public LoginService getService() { return LoginService.this; }
    }

    public LoginService() {
        this.binder = new LoginServiceBinder();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public void Event(Utilisateur utilisateur) {
        UtilisateurEngine utilisateurEngine = new UtilisateurEngine();
        Utilisateur retour = utilisateurEngine.Connexion(utilisateur);
        Log.i(LoginService.class.getName(), retour.toString());
    }
}
