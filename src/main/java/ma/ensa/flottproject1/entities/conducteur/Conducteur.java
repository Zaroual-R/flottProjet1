package ma.ensa.flottproject1.entities.conducteur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.flottproject1.entities.vehicule.TypeVehicule;
import ma.ensa.flottproject1.entities.voyage.Voyage;

import java.util.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Conducteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConducteur;
    private String nom ;
    private String prenom;
    private String adress;
    private Date dateNaissance;
    @Column(unique = true)
    private String matricule;

    private String CIN;

    @Enumerated(EnumType.STRING)
    private TypeVehicule typeVehicule;

    @OneToMany(mappedBy = "conducteur")
    private List<Voyage> listVoyages;

    @OneToMany(mappedBy = "conducteur")
    private List<Certificat> listCertificat;

    @OneToMany(mappedBy = "conducteur")
    private List<Formation> listFormation;

    @OneToMany(mappedBy = "conducteur")
    private List<Experience> listExperience;

    @OneToOne
    private Permis permis;

}

