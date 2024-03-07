package ma.ensa.flottproject1.entities.vehicule;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssuranceAutomobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String compagnieAssurance;

    private String typeCouverture;
    private LocalDate dateDebut;

    private LocalDate dateFin;

    private double prime;

    private int dureeValidite;

    @ManyToOne
    private Vehicule vehicule;

}
