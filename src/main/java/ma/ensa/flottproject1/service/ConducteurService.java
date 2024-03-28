package ma.ensa.flottproject1.service;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.entities.conducteur.Permis;
import ma.ensa.flottproject1.entities.voyage.Voyage;

import java.util.Date;
import java.util.List;

public interface ConducteurService {

    public Conducteur createConducteur(Conducteur newconducteur);

    public Conducteur updateConducteur(Long id, Conducteur newconducteur);
    public void deleteConducteur(Long id);
    public Conducteur getConducteurById(Long id);
    public List<Conducteur> getAllConducteur();

    List<Conducteur> getAllConducteursByCompetence(Voyage voyage);

    List<Conducteur> getAllDriversBetweenDates(Date startDate, Date endDate);
}
