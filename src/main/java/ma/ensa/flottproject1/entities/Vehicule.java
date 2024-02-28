package ma.ensa.flottproject1.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Vehicule {
    @Id
    private String immatreculation;
    private String marque;
    private String model ;
    private String type;
    private double kilometrage;
    private char typePermisRequis;
    @OneToMany(mappedBy = "vehicule")
    private List<Voyage> listVoyages;
}
