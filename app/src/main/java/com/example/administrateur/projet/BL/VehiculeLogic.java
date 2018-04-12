package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.DAL.VehiculeEngine;

/**
 * Created by Administrateur on 12/04/2018.
 */

public class VehiculeLogic {

    private static VehiculeEngine vehiculeEngine;

    public static Vehicule getVehiculebyId(int id) {
        return vehiculeEngine.getVehiculeById(id);
    }

    public static void setVehicules() {
        vehiculeEngine.setVehicules();
    }

}
