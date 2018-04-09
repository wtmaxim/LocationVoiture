package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class LocationBouchon {
    private static List<Vehicule> vehicules = new ArrayList<>();

    private static List<Vehicule> getVehicules() {
        vehicules.add(new Vehicule(1, "Voiture 1", 4, 6, 2, 30, 100, false));
        vehicules.add(new Vehicule(2, "Voiture 2", 2, 6, 2, 30, 100, false));
        vehicules.add(new Vehicule(3, "Voiture 3", 1, 6, 2, 30, 100, true));
        vehicules.add(new Vehicule(4, "Voiture 4", 8, 6, 2, 30, 100, false));
        vehicules.add(new Vehicule(5, "Voiture 5", 4, 6, 2, 30, 100, false));
        vehicules.add(new Vehicule(6, "Voiture 6", 2, 6, 2, 30, 100, true));
        vehicules.add(new Vehicule(7, "Voiture 7", 4, 6, 2, 30, 100, false));
        vehicules.add(new Vehicule(8, "Voiture 8", 4, 6, 2, 30, 100, true));
        vehicules.add(new Vehicule(9, "Voiture 9", 4, 6, 2, 30, 100, true));

        return vehicules;
    }



}
