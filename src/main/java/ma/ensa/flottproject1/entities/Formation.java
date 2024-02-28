package ma.ensa.flottproject1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;
    private int dureFormation;
    private String nomFormation;

    @ManyToOne
    @JoinColumn(name="nom")
    private Conducteur conducteur;
}
