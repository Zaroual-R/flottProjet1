package ma.ensa.flottproject1.entities.conducteur;

import jakarta.persistence.Entity;
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
    private char typePermis;
    private Date dateRemis;
    private Date dateFinValidite;

}
