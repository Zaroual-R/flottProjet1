package ma.ensa.flottproject1.service;

import ma.ensa.flottproject1.entities.conducteur.TypePermis;
import ma.ensa.flottproject1.entities.vehicule.TypeVehicule;
import ma.ensa.flottproject1.entities.vehicule.Vehicule;

import java.util.Map;

public interface MatcherVehiculeService {




    TypePermis convertVehiculeToPermisType(Vehicule vehicule);
}
