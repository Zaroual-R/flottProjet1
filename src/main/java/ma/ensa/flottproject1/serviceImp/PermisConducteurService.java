package ma.ensa.flottproject1.serviceImp;

import ma.ensa.flottproject1.constants.ErrorMessages;
import ma.ensa.flottproject1.constants.RessourceTypeConstants;
import ma.ensa.flottproject1.entities.conducteur.Permis;
import ma.ensa.flottproject1.exceptions.RessourceAlreadyExistException;
import ma.ensa.flottproject1.repository.PermisRepository;
import ma.ensa.flottproject1.service.PermisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisConducteurService implements PermisService {


    @Autowired
    private PermisRepository permisRepository;
    @Override
    public Permis createPermis(Permis permis) {
        Optional<Permis> permisOptional = permisRepository.findByNumeroPermis(permis.getNumeroPermis());
        if(permisOptional.isPresent()){
            throw new RessourceAlreadyExistException(RessourceTypeConstants.PERMIS, permis.getIdPermis(), ErrorMessages.PERMISEXISTALREADYEXCEPTION);
        }

        return permisRepository.save(permis);
    }

    @Override
    public Permis updatePermis(Long id, Permis newPermis) {
        return null;
    }

    @Override
    public void deletePermis(Long id) {

    }

    @Override
    public Permis getPermisById(Long id) {
        return null;
    }

    @Override
    public List<Permis> getAllPermis() {
        return null;
    }
}
