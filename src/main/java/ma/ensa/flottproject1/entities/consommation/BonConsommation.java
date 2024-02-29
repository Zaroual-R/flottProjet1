package ma.ensa.flottproject1.entities.consommation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.flottproject1.entities.voyage.Voyage;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class BonConsommation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBon ;
    private String immatreculationVehicul;
    private String nomConducteur;
    private Date dateVoyage;
    private double nbrKillometres;
    private String typeCarburant;
    private double quantiteConsommee;
    private double cout;
    private String lieuRavitaillement;

    @OneToOne
    @JoinColumn(name="idVoyage")
    private Voyage voyage;
}
