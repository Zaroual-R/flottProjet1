package ma.ensa.flottproject1.service;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.repository.ConducteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ConducteurService {

    public Conducteur createConducteur(Conducteur newconducteur);
    public Conducteur updateConducteur(Conducteur newconducteur);
    public boolean deleteConducteur(Long id);
    public Conducteur getConducteurById(Long id);
    public List<Conducteur> getAllConducteur();

}
