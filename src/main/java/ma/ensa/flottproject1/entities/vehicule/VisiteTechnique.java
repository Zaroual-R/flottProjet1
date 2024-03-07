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
public class VisiteTechnique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateVisite;
    private LocalDate dateExpiration;

    private String centreVisite;

    private boolean attestationConformite;

    @ManyToOne
    private Vehicule vehicule;
}
