package com.example.administrateur.projet.BL;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.DAL.VehiculeEngine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

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

    public Vehicule jsonToBo(JSONObject jsonObject) {
        Vehicule vehicule = null;
        try {
            vehicule = new Vehicule();
            vehicule.setId(Integer.parseInt(jsonObject.getString("vehiculeID")));
            vehicule.setLibelle("Truc");
            vehicule.setNbPlaces(Integer.parseInt(jsonObject.getString("nbPlaces")));
            vehicule.setDureeMin(Float.parseFloat(jsonObject.getString("locationMin")));
            vehicule.setDureeMax(Float.parseFloat(jsonObject.getString("locationMax")));
            vehicule.setTariffMin(Float.parseFloat(jsonObject.getString("tarifMin")));
            vehicule.setTarifMax(Float.parseFloat(jsonObject.getString("tarifMax")));
            vehicule.setEstLoue(Boolean.parseBoolean(jsonObject.getString("isDisponible")));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return vehicule;
    }
}
