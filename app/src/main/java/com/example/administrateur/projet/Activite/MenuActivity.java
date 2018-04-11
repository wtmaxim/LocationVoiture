package com.example.administrateur.projet.Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.Fragment.MenuFragment;
import com.example.administrateur.projet.Fragment.ModifierAgenceFragment;
import com.example.administrateur.projet.R;

public class MenuActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener {

    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getIntent();
        id = intent.getStringExtra("id");
    }

    @Override
    public void listeVehiculeDispo() {
        Intent intent = new Intent(MenuActivity.this, VehiculesDisponiblesActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

    @Override
    public void modifierAgence() {
        Intent intent = new Intent(MenuActivity.this, ModifierAgenceActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

    @Override
    public void listeVehiculeLoue() {
        Intent intent = new Intent(MenuActivity.this, VehiculesLouesActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}
