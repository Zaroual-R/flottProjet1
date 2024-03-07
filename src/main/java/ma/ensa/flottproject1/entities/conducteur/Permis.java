package ma.ensa.flottproject1.entities.conducteur;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
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
    private String numeroPermis;

    @Enumerated(EnumType.STRING)
    private TypePermis typePermis;
    private Date dateRemis;
    private Date dateFinValidite;

}
