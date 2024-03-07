package ma.ensa.flottproject1.entities.vehicule;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marqueId;

    private String marqueNom;

    @OneToMany(mappedBy = "marque")
    private List<Vehicule> vehiculeList;

}
