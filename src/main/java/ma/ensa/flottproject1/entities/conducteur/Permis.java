package ma.ensa.flottproject1.entities.conducteur;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermis;

    @Column(unique = true)
    private String numeroPermis;

    @Enumerated(EnumType.STRING)
    private TypePermis typePermis;
    private Date dateRemis;
    private Date dateFinValidite;

}
