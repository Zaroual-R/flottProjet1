package ma.ensa.flottproject1.serviceImp;


import ma.ensa.flottproject1.entities.conducteur.TypePermis;
import ma.ensa.flottproject1.entities.vehicule.Vehicule;
import ma.ensa.flottproject1.service.MatcherVehiculeService;
import org.springframework.stereotype.Service;

@Service
public class MatcherVehiculeServiceImp implements MatcherVehiculeService {

    @Override
    public TypePermis convertVehiculeToPermisType(Vehicule vehicule) {
        switch (vehicule.getType()) {
            case FOURGONNETTE:
            case CAMIONNETTE:
            case BERLINE:
            case TRANSITE:
            case CARAVANE:
            case SUV:
            case CROSSOVER:
            case COUPE:
            case CABRIOLET:
            case MONOSPACE:
            case LIMOUSINE:
                return TypePermis.B;
            case CAMION:
            case CAMION_LOURD:
            case SEMI_REMORQUE:
                return TypePermis.C;
            case BUS:
            case MINIBUS:
                return TypePermis.D;
            default:
                return TypePermis.A;
        }
    }
}
