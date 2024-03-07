package ma.ensa.flottproject1;

import ma.ensa.flottproject1.entities.vehicule.Vehicule;
import ma.ensa.flottproject1.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MVCapplication {
    @Autowired
    private VehiculeRepository vehiculeRepository;

    public static void main(String[] args){SpringApplication.run(MVCapplication.class, args);}

    public void run(String... args) {

//        vehiculeRepository.save(new Vehicule("AF456", "Toyota", "Corolla", "Berline", 50000, 'B', null));
//        vehiculeRepository.save(new Vehicule("DJ457", "Ford", "Focus", "Compacte", 30000, 'B', null));
//
//        System.out.println("Liste des véhicules enregistrés :");
//        vehiculeRepository.findAll().forEach(System.out::println);
    }
}

