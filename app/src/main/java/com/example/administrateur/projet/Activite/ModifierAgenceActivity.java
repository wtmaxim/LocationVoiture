package com.example.administrateur.projet.Activite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.Fragment.ModifierAgenceFragment;
import com.example.administrateur.projet.R;

public class ModifierAgenceActivity extends AppCompatActivity implements ModifierAgenceFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_agence);
    }

    @Override
    public void Modifier(Agence agence) {

    }
}
