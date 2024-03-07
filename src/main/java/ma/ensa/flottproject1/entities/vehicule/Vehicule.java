package ma.ensa.flottproject1.entities.vehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.flottproject1.entities.voyage.Voyage;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue
    private Long idVehicule;

    @Column(unique = true)
    private String immatreculation;

    private String model ;
    private String type;
    private double kilometrage;
    private char typePermisRequis;
    @OneToMany(mappedBy = "vehicule")
    private List<Voyage> listVoyages;

    @ManyToOne
    private Marque marque;

    @OneToOne(mappedBy = "vehicule")
    private CarteGrise carteGrise;

    @OneToMany(mappedBy = "vehicule")
    private List<Vignette> vignetteList;

    @OneToMany(mappedBy = "vehicule")
    private List<VisiteTechnique> visiteTechniqueList;

    @OneToMany(mappedBy = "vehicule")
    private List<AssuranceAutomobile> assuranceAutomobileList;


}
