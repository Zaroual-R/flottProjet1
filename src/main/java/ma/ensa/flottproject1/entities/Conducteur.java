package ma.ensa.flottproject1.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String matricule;
    private String CIN;
    private String numeroPermis;
    private Date dateRemisPermis;
    private char typePermis;
    @OneToMany(mappedBy = "conducteur")
    private List<Voyage> listVoyages;

    @OneToMany(mappedBy = "conducteur")
    private List<Certificat> listCertificat;

    @OneToMany(mappedBy = "conducteur")
    private List<Formation> listFormation;

    @OneToMany(mappedBy = "conducteur")
    private List<Experience> listExperience;
}

