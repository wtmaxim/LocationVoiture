package com.example.administrateur.projet.DAL;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.Bouchon.AgenceBouchon;
import com.example.administrateur.projet.Bouchon.VehiculeBouchon;

import java.util.List;
import java.util.Vector;

/**
 * Created by Administrateur on 12/04/2018.
 */

public class VehiculeEngine {

    public static void setVehicules() {
        VehiculeBouchon.setVehicules();
    }

    public static Vehicule getVehiculeById(int id) {
        List<Vehicule> vehicules = VehiculeBouchon.getVehicules();

        for (Vehicule item : vehicules) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }

}
