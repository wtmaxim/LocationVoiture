package com.example.administrateur.projet.Activite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.BL.AgenceLogic;
import com.example.administrateur.projet.BL.LocationLogic;
import com.example.administrateur.projet.BL.LoginLogic;
import com.example.administrateur.projet.BL.VehiculeLogic;
import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Location;
import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.DAL.LocationEngine;
import com.example.administrateur.projet.DAL.UtilisateurEngine;
import com.example.administrateur.projet.Fragment.LouerVehiculeFragment;
import com.example.administrateur.projet.Fragment.ModifierAgenceFragment;
import com.example.administrateur.projet.Fragment.VehiculesLouesFragment;
import com.example.administrateur.projet.R;

public class LouerVehiculeActivity extends AppCompatActivity implements LouerVehiculeFragment.OnFragmentInteractionListener {

    int idVehicule;
    int idUtilisateur;
    Vehicule vehicule;
    Agence agence;
    Utilisateur utilisateur;
    LouerVehiculeFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louer_vehicule);

        fragment = (LouerVehiculeFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_louer_vehicule);
    }

    @Override
    protected void onResume() {
        super.onResume();

        idUtilisateur = getIntent().getIntExtra("idUtilisateur", -1);
        idVehicule = getIntent().getIntExtra("idVehicule", -1);

        vehicule = VehiculeLogic.getVehiculebyId(idVehicule);
        utilisateur = LoginLogic.getUtilisateurById(idUtilisateur);
        agence = AgenceLogic.getAgencebyId(utilisateur.getAgenceId());

        fragment.setVehicule(vehicule, utilisateur);
    }

    @Override
    public void reserver(Location location) {
        //LocationLogic.
    }
}
