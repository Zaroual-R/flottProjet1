package ma.ensa.flottproject1.entities.conducteur;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Certificat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCertificat;
    private Date dateObtenir;
    private String nameCertificat;

    @ManyToOne
    @JoinColumn(name="nom")
    private Conducteur conducteur;
}
