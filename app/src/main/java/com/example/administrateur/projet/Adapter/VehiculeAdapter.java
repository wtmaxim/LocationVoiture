package com.example.administrateur.projet.Adapter;

import android.content.Context;
import android.provider.Telephony;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.R;

import java.util.List;

public class VehiculeAdapter extends ArrayAdapter<Vehicule> {

    private int layout;

    public VehiculeAdapter(@NonNull Context context,
                          int resource,
                          @NonNull List<Vehicule> objects) {
        super(context, resource, objects);
        this.layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable
            View convertView, @NonNull
                                ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)
                    getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(this.layout, parent, false);
        }

        TextView vehiculeId = convertView.findViewById(R.id.ligne_liste_vehicule_id);
        TextView vehiculeLibelle = convertView.findViewById(R.id.ligne_liste_vehicule_libelle);
        TextView nbPlaces = convertView.findViewById(R.id.ligne_liste_vehicule_nbPlaces);
        TextView locationMin = convertView.findViewById(R.id.ligne_liste_vehicule_locationMin);
        TextView locationMax = convertView.findViewById(R.id.ligne_liste_vehicule_locationMax);
        TextView tarifMin = convertView.findViewById(R.id.ligne_liste_vehicule_tarifMin);
        TextView tarifMax = convertView.findViewById(R.id.ligne_liste_vehicule_tarifMax);

        Vehicule vehicule = this.getItem(position);

        vehiculeId.setText(vehicule.getId());
        vehiculeLibelle.setText(vehicule.getLibelle());
        nbPlaces.setText(vehicule.getNbPlaces());
        locationMin.setText(String.valueOf(vehicule.getDureeMin()));
        locationMax.setText(String.valueOf(vehicule.getDureeMax()));
        tarifMin.setText(String.valueOf(vehicule.getTariffMin()));
        tarifMax.setText(String.valueOf(vehicule.getTarifMax()));

        return convertView;
    }
}
