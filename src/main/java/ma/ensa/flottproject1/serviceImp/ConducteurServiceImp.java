package ma.ensa.flottproject1.serviceImp;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.repository.ConducteurRepository;
import ma.ensa.flottproject1.service.ConducteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConducteurServiceImp implements ConducteurService {

    @Autowired
    private ConducteurRepository conducteurRepository;

    @Override
    public Conducteur createConducteur(Conducteur newconducteur) {
        //Conducteur conducteur = conducteurRepository.findById(newconducteur.getIdConducteur()).get();

            return conducteurRepository.save(newconducteur);

    }

    @Override
    public Conducteur updateConducteur(Conducteur newconducteur) {
        if(conducteurRepository.existsById(newconducteur.getIdConducteur())){
            return conducteurRepository.save(newconducteur);
        }
        return null;
    }

    @Override
    public boolean deleteConducteur(Long id) {
        if(conducteurRepository.existsById(id)){
            conducteurRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Conducteur getConducteurById(Long id) {
        if(conducteurRepository.existsById(id)){
            return conducteurRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<Conducteur> getAllConducteur() {
        return conducteurRepository.findAll();
    }
}
