package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.BO.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class LocationBouchon {
    private static List<Vehicule> vehicules = new ArrayList<>();

    private static List<Vehicule> getVehicules() {
        vehicules.add(new Vehicule(1, "Classe A", "Mercedes", false));
        vehicules.add(new Vehicule(2, "Classe B", "Mercedes", false));
        vehicules.add(new Vehicule(3, "Classe C", "Mercedes", true));
        vehicules.add(new Vehicule(4, "Classe E", "Mercedes", false));
        vehicules.add(new Vehicule(5, "CLA", "Mercedes", true));
        vehicules.add(new Vehicule(6, "GLA", "Mercedes", false));

        return vehicules;
    }



}
