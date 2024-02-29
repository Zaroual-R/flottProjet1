package ma.ensa.flottproject1.entities.conducteur;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ensa.flottproject1.entities.conducteur.Conducteur;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long  IdExperience;
   private int nbrAnnees;
   private String secteur;

    @ManyToOne
    @JoinColumn(name="nom")
    private Conducteur conducteur;
}
