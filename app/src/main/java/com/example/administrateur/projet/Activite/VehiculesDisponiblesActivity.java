package com.example.administrateur.projet.Activite;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.Bouchon.LocationBouchon;
import com.example.administrateur.projet.DAL.ILocation;
import com.example.administrateur.projet.Fragment.VehiculesDisponiblesFragment;
import com.example.administrateur.projet.R;

import java.util.List;

public class VehiculesDisponiblesActivity extends AppCompatActivity implements VehiculesDisponiblesFragment.OnFragmentInteractionListener{
    private VehiculesDisponiblesFragment fragment;
    private int idUtilisateur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vehicules_disponibles);
        this.fragment = (VehiculesDisponiblesFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_vehicule_dispo);

        new ListAsyncTask().execute();
    }

    @Override
    protected void onResume() {
        super.onResume();

        idUtilisateur = getIntent().getIntExtra("id", -1);
    }

    @Override
    public void clickVehicule(Vehicule vehicule) {

        Intent intent = new Intent(VehiculesDisponiblesActivity.this, LouerVehiculeActivity.class);
        intent.putExtra("idVehicule", vehicule.getId());
        intent.putExtra("idUtilisateur", idUtilisateur);
        startActivity(intent);
    }

    private class ListAsyncTask extends AsyncTask<Void, Integer, Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            ILocation location = (ILocation) new LocationBouchon();
            List<Vehicule> vehiculeList = location.getVehiculesDisponibles();
            fragment.setList(vehiculeList);
            return null;
        }
    }
}
