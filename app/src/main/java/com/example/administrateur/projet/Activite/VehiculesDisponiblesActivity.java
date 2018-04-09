package com.example.administrateur.projet.Activite;

import android.app.Fragment;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.DAL.ILocation;
import com.example.administrateur.projet.DAL.LoginEngine;
import com.example.administrateur.projet.Fragment.VehiculesDisponiblesFragment;
import com.example.administrateur.projet.R;

import java.util.List;

public class VehiculesDisponiblesActivity extends AppCompatActivity implements VehiculesDisponiblesFragment.OnFragmentInteractionListener{

    private VehiculesDisponiblesFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.fragment = (VehiculesDisponiblesFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_vehicule_dispo);
        new ListAsyncTask().execute();
        setContentView(R.layout.activity_vehicules_disponibles);
    }

    @Override
    public void clickVehicule(Vehicule vehicule) {

    }

    private class ListAsyncTask extends AsyncTask<Void, Integer, Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            ILocation location = (ILocation) new LoginEngine();
            List<Vehicule> vehiculeList = location.getVehiculesDisponibles();
            fragment.setList(vehiculeList);
            return null;
        }
    }
}
