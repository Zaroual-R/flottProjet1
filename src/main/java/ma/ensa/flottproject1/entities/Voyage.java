package ma.ensa.flottproject1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVoyage ;
    private Date dateDepart;
    private int  heureDepart;
    private Date DateArriveePrevue;
    private int heurArriveePrevue;
    private String depart;
    private String destination;
    private String typeVehicule;
    private int nbrPassage;
    private String autreDetails;

    @ManyToOne
    @JoinColumn(name="immatreculation")
    private Vehicule vehicule;

    @ManyToOne
    @JoinColumn(name="idConducteur")
    private Conducteur conducteur;


}
