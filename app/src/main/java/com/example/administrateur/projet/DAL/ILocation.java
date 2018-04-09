package com.example.administrateur.projet.DAL;

import com.example.administrateur.projet.BO.Vehicule;

import java.util.List;

/**
 * Created by Administrateur on 09/04/2018.
 */

public interface ILocation {

    void louer(Vehicule vehicule);
    void rendre(Vehicule vehicule);
    List<Vehicule> getVehiculesLoues();
    List<Vehicule> getVehiculesDisponibles();
}
