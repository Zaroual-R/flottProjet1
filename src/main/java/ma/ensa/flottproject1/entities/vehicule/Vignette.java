package ma.ensa.flottproject1.entities.vehicule;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vignette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateDelivrance;

    private LocalDate dateExpiration;

    private String autorisationDelevrantAdresse;

    @ManyToOne
    private Vehicule vehicule;


}
