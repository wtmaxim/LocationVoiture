package com.example.administrateur.projet.Activite;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Fragment.ConnexionFragment;
import com.example.administrateur.projet.R;
import com.example.administrateur.projet.Service.LoginService;

public class ConnexionActivity extends AppCompatActivity implements ConnexionFragment.OnFragmentInteractionListener {
    private LoginService loginService;
    private Utilisateur utilisateur2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

    }

    @Override
    public void Connexion(Utilisateur utilisateur) {
        Intent intent = new Intent(ConnexionActivity.this, LoginService.class);
        //intent.putExtra("Utilisateur", utilisateur);
        utilisateur2 = utilisateur;
        bindService(intent, serviceConnection, BIND_AUTO_CREATE);
    }

    @Override
    public void Inscription() {
        Intent intent = new Intent(ConnexionActivity.this, InscriptionActivity.class);
        startActivity(intent);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            loginService = ((LoginService.LoginServiceBinder) iBinder).getService();
            loginService.Event(utilisateur2);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
}
