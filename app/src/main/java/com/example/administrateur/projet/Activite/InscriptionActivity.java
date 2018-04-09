package com.example.administrateur.projet.Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Fragment.InscriptionFragment;
import com.example.administrateur.projet.R;

public class InscriptionActivity extends AppCompatActivity implements InscriptionFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

    }

    @Override
    public void Inscription(Utilisateur utilisateur) {

    }

    @Override
    public void Connexion() {
        Intent intent = new Intent(InscriptionActivity.this, ConnexionActivity.class);
        startActivity(intent);
    }
}
