package ma.ensa.flottproject1.entities.consommation.rapports;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.entities.vehicule.Marque;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RapportParMarque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRapport;
    private Date reportDate;

    @ManyToOne
    private Marque marque;
}
