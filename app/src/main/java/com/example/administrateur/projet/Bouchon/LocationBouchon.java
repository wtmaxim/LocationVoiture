package com.example.administrateur.projet.Bouchon;

import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Location;
import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.DAL.ILocation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LocationBouchon {
    private static List<Location> locations = new ArrayList<>();

  /*  public static void setLocations() {
        locations.add(new Location(1, "12/04/2018", "15/04/2018", 12f, "1", "1"));
        locations.add(new Location());
        //return agences;
    } */

    public static  List<Location> getLocations() {
        return locations;
    }

}
