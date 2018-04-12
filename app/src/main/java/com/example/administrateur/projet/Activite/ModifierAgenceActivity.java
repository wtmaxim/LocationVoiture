package com.example.administrateur.projet.Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.BL.AgenceLogic;
import com.example.administrateur.projet.BL.LoginLogic;
import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Fragment.ModifierAgenceFragment;
import com.example.administrateur.projet.R;

public class ModifierAgenceActivity extends AppCompatActivity implements ModifierAgenceFragment.OnFragmentInteractionListener {

    ModifierAgenceFragment fragment;
    Utilisateur utilisateur;
    LoginLogic loginLogic;
    AgenceLogic agenceLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_agence);

        fragment = (ModifierAgenceFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_modifier_agence);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", -1);

        utilisateur = loginLogic.getUtilisateurById(id);
        Agence agence = agenceLogic.getAgencebyId(utilisateur.getAgenceId());

        fragment.setAgence(agence);
    }

    @Override
    public void Modifier(Agence agence) {
        agenceLogic.update(agence);
        Intent intent = new Intent(ModifierAgenceActivity.this, MenuActivity.class);
        intent.putExtra("id", utilisateur.getId());
        startActivity(intent);
    }
}
