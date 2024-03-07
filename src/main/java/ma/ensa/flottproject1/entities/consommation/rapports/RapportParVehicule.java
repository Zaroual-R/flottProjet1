package ma.ensa.flottproject1.entities.consommation.rapports;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.flottproject1.entities.vehicule.Vehicule;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RapportParVehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRapport;
    private Date reportDate;

    @ManyToOne
    private Vehicule vehicule;


}