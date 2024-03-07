package ma.ensa.flottproject1.serviceImp;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.repository.ConducteurRepository;
import ma.ensa.flottproject1.service.ConducteurService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class ConducteurServiceImpTest {

    private ConducteurService conducteurService;
    @Mock
    private ConducteurRepository conducteurRepository;
    private Conducteur conducteur;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this); // Initialisation des mocks
        conducteurService = new ConducteurServiceImp(); // Injection du mock de ConducteurRepository
        conducteur = Conducteur.builder()
                .CIN("JC5555")
                .nom("ayoub")
                .prenom("achraf")
                .dateNaissance(Date.valueOf(LocalDate.of(2000, 12, 12)))
                .matricule("kkkkkk")
                .build();
    }
    @Test
    @DisplayName("test création conducteur")
    public void testCreateConducteur(){
        Conducteur savedConducteur = conducteurService.createConducteur(conducteur);
        assertNotNull(savedConducteur);
    }
}