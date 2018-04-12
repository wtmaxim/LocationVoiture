package com.example.administrateur.projet.Activite;

import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.Bouchon.LocationBouchon;
import com.example.administrateur.projet.DAL.ILocation;
import com.example.administrateur.projet.Fragment.VehiculesDisponiblesFragment;
import com.example.administrateur.projet.Fragment.VehiculesLouesFragment;
import com.example.administrateur.projet.R;

import java.util.List;

public class VehiculesLouesActivity extends AppCompatActivity implements VehiculesLouesFragment.OnFragmentInteractionListener {
    private VehiculesDisponiblesFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicules_loues);

        this.fragment = (VehiculesDisponiblesFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_vehicule_dispo);

        //new ListAsyncTask().execute();
    }

    @Override
    public void clickVehicule(Vehicule vehicule) {

    }


    private class ListAsyncTask extends AsyncTask<Void, Integer, Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            ILocation location = (ILocation) new LocationBouchon();
            List<Vehicule> vehiculeList = location.getVehiculesLoues();
            fragment.setList(vehiculeList);
            return null;
        }
    }
}
