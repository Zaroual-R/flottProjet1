package ma.ensa.flottproject1.serviceImp;

import ma.ensa.flottproject1.constants.ErrorMessages;
import ma.ensa.flottproject1.constants.RessourceTypeConstants;
import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.entities.conducteur.TypePermis;
import ma.ensa.flottproject1.entities.voyage.Voyage;
import ma.ensa.flottproject1.exceptions.RessourceAlreadyExistException;
import ma.ensa.flottproject1.exceptions.RessourceNotFoundException;
import ma.ensa.flottproject1.repository.ConducteurRepository;
import ma.ensa.flottproject1.repository.PermisRepository;
import ma.ensa.flottproject1.service.ConducteurService;
import ma.ensa.flottproject1.service.MatcherVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ConducteurServiceImp implements ConducteurService {
    @Autowired
    private ConducteurRepository conducteurRepository;

    @Autowired
    private MatcherVehiculeService matcherVehiculeService;

    @Autowired
    public ConducteurServiceImp(ConducteurRepository conducteurRepository) {
        this.conducteurRepository = conducteurRepository;
    }

    @Autowired
    private PermisRepository permisRepository;


    @Override
    public Conducteur createConducteur(Conducteur newconducteur) {

            Optional<Conducteur> conducteurOptional = conducteurRepository.findByMatricule(newconducteur.getMatricule());

            if(conducteurOptional.isPresent()){
                throw new RessourceAlreadyExistException(RessourceTypeConstants.CONDUCTEUR,newconducteur.getMatricule(),ErrorMessages.ConducteurNotFoundMessage);
            }

            return conducteurRepository.save(newconducteur);

    }



    @Override
    public Conducteur updateConducteur(Long id, Conducteur newconducteure) {
        if(conducteurRepository.existsById(id)){
            return conducteurRepository.save(newconducteure);
        }
        throw new RessourceNotFoundException(RessourceTypeConstants.CONDUCTEUR,newconducteure.getMatricule(),ErrorMessages.ConducteurNotFoundMessage);
    }

    @Override
    public void deleteConducteur(Long id) {
        if(conducteurRepository.existsById(id)){
            conducteurRepository.deleteById(id);
        }
        throw new RessourceNotFoundException(RessourceTypeConstants.CONDUCTEUR,id,ErrorMessages.ConducteurNotFoundMessage);
    }

    @Override
    public Conducteur getConducteurById(Long id) {
        if(conducteurRepository.existsById(id)){
            return conducteurRepository.findById(id).get();
        }
        throw new RessourceNotFoundException(RessourceTypeConstants.CONDUCTEUR,id,ErrorMessages.ConducteurNotFoundMessage);

    }

    @Override
    public List<Conducteur> getAllConducteur() {
        List<Conducteur> conducteurList = conducteurRepository.findAll();
        if(conducteurList.isEmpty()){
            return Collections.emptyList();
        }
        return conducteurList;
    }

    @Override
    public List<Conducteur> getAllConducteursByCompetence(Voyage voyage) {
        TypePermis requiredPermis = matcherVehiculeService.convertVehiculeToPermisType(voyage.getVehicule());

        return conducteurRepository.findAll().stream()
                .filter(conducteur -> conducteur.getPermis() != null && conducteur.getPermis().getTypePermis().equals(requiredPermis))
                .collect(Collectors.toList());
    }

    @Override
    public List<Conducteur> getAllDriversBetweenDates(Date startDate, Date endDate) {
        List<Conducteur> conducteurList = conducteurRepository.findAll().stream()
                .filter(conducteur -> conducteur.getListVoyages().stream()
                        .noneMatch(voyage -> voyage.getDateDepart().before(endDate) && voyage.getDateArriveePrevue().after(startDate)))
                .collect(Collectors.toList());


        return conducteurList;
    }


}
