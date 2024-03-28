package ma.ensa.flottproject1.controller;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.service.ConducteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/conducteur")
@RestController
public class ConducteurController {

    @Autowired
    public ConducteurService conducteurService;

    @PostMapping("/create")
    public ResponseEntity<?> createConducteur(@RequestBody Conducteur conducteur){
        try {
            Conducteur reconducteur = conducteurService.createConducteur(conducteur);
            return ResponseEntity.status(HttpStatus.CREATED).body(reconducteur);
        }catch (Exception ex) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur est survenue lors de la création du conducteur.");
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateConducteur(@PathVariable Long id, @RequestBody Conducteur conducteur){
        Conducteur conducteur1 =  conducteurService.updateConducteur(id,conducteur);
        return ResponseEntity.status(HttpStatus.OK).body(conducteur1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getConducteur(@PathVariable Long id){
        Conducteur conducteur1 =  conducteurService.getConducteurById(id);
        return ResponseEntity.status(HttpStatus.OK).body(conducteur1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteConducteurByConducteur(@PathVariable Long id){
        conducteurService.deleteConducteur(id);
        return ResponseEntity.status(HttpStatus.OK).body("conducteur supprimé avec succés");
    }

}
