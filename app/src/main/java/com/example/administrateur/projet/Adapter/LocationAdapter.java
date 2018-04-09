package com.example.administrateur.projet.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.example.administrateur.projet.BO.Location;

import java.util.List;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(@NonNull Context context, int resource, @NonNull List<Location> objects) {
        super(context, resource, objects);
    }
}
