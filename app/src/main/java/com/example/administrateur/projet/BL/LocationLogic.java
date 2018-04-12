package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.DAL.AgenceEngine;
import com.example.administrateur.projet.DAL.LocationEngine;

/**
 * Created by Administrateur on 11/04/2018.
 */

public class LocationLogic {
    private static LocationEngine locationEngine;

    public static void setLocations() {
        locationEngine.setLocation();
    }
}
