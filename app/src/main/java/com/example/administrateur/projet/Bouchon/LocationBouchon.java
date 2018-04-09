package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.DAL.ILocation;

import java.util.ArrayList;
import java.util.List;

public class LocationBouchon implements ILocation {

    private static List<Vehicule> vehicules = new ArrayList<>();

    @Override
    public void louer(Vehicule vehicule) {
        vehicule.setEstLoue(true);
    }

    @Override
    public void rendre(Vehicule vehicule) {
        vehicule.setEstLoue(false);
    }

    @Override
    public List<Vehicule> getVehiculesLoues() {
        return getVehicules(true);
    }

    @Override
    public List<Vehicule> getVehiculesDisponibles() {
        return getVehicules(false);
    }

    private List<Vehicule> getDataVehicules() {
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

    private List<Vehicule> getVehicules(Boolean estLoue) {
        for (Vehicule v : getDataVehicules()) {
            if (v.isEstLoue() == estLoue) {
                vehicules.remove(v);
            }
        }
        return vehicules;
    }
}
