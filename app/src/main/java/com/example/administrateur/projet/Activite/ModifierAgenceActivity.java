package com.example.administrateur.projet.Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.BL.LoginLogic;
import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Fragment.ModifierAgenceFragment;
import com.example.administrateur.projet.R;

public class ModifierAgenceActivity extends AppCompatActivity implements ModifierAgenceFragment.OnFragmentInteractionListener {

    ModifierAgenceFragment fragment;
    Utilisateur utilisateur;
    LoginLogic loginLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_agence);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //utilisateur;

       // fragment.getUtilisateur(utilisateur);
    }

    @Override
    public void Modifier(Agence agence) {
        Intent intent = new Intent(ModifierAgenceActivity.this, MenuActivity.class);
        startActivity(intent);
    }
}
