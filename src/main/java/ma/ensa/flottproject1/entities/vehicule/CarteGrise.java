package ma.ensa.flottproject1.entities.vehicule;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarteGrise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String immatriculationAnterieur;
    private Date premierMiseEnCirculation;
    private Date mCauMaroc;
    private Date finDeValidite;

    @OneToOne
    private Vehicule vehicule;

}
