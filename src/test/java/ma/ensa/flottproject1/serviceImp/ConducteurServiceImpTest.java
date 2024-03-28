package ma.ensa.flottproject1.serviceImp;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.exceptions.RessourceAlreadyExistException;
import ma.ensa.flottproject1.repository.ConducteurRepository;
import ma.ensa.flottproject1.serviceImp.ConducteurServiceImp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConducteurServiceImpTest {

    @InjectMocks
    private ConducteurServiceImp conducteurService;

    @Mock
    private ConducteurRepository conducteurRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        conducteurService = new ConducteurServiceImp((conducteurRepository));
    }

    @Test
    @DisplayName("Test création conducteur avec succès")
    public void testCreateConducteurSuccess() {
        Conducteur conducteurToCreate = Conducteur.builder()
                .CIN("JC5555")
                .nom("ayoub")
                .prenom("achraf")
                .dateNaissance(Date.valueOf(LocalDate.of(2000, 12, 12)))
                .matricule("12345")
                .build();

        when(conducteurRepository.findByMatricule("12345")).thenReturn(Optional.empty());
        when(conducteurRepository.save(conducteurToCreate))
                .thenAnswer(invocation -> {
                    Conducteur savedConducteur = invocation.getArgument(0);
                    savedConducteur.setIdConducteur(1L);
                    return savedConducteur;
                });


        Conducteur savedConducteur = conducteurService.createConducteur(conducteurToCreate);


        assertEquals(conducteurToCreate, savedConducteur);

    }

    @Test
    @DisplayName("Test création conducteur avec matricule existant")
    public void testCreateConducteurMatriculeExists() {
        Conducteur existingConducteur = Conducteur.builder()
                .CIN("JC5555")
                .nom("ayoub")
                .prenom("achraf")
                .dateNaissance(Date.valueOf(LocalDate.of(2000, 12, 12)))
                .matricule("kkkkkk")
                .build();

        when(conducteurRepository.findByMatricule("kkkkkk")).thenReturn(Optional.of(existingConducteur)); // Mock du comportement de findByMatricule

        assertThrows(RessourceAlreadyExistException.class, () -> {
            conducteurService.createConducteur(existingConducteur);
        });

        verify(conducteurRepository, times(1)).findByMatricule(anyString()); // Vérifie que findByMatricule a été appelé exactement une fois
        verify(conducteurRepository, never()).save(any(Conducteur.class)); // Vérifie que save n'a pas été appelé
    }

    @Test
    @DisplayName("Test modification conducteur avec succès")
    public void testUpdateConducteurSuccess(){
        Conducteur existingConducteur = Conducteur.builder()
                .idConducteur(1L)
                .CIN("JC5555")
                .nom("ayoub")
                .prenom("achraf")
                .dateNaissance(Date.valueOf(LocalDate.of(2000, 12, 12)))
                .matricule("12345")
                .build();
        Conducteur updatedConducteur = Conducteur.builder()
                .idConducteur(1L)
                .CIN("JC5555")
                .nom("ayoub")
                .prenom("achraf")
                .dateNaissance(Date.valueOf(LocalDate.of(2000, 12, 12)))
                .matricule("54321")
                .build();

        when(conducteurRepository.existsById(1L)).thenReturn(true);
        when(conducteurRepository.save(updatedConducteur)).thenReturn(updatedConducteur);

        Conducteur updatedResult = conducteurService.updateConducteur(1L, updatedConducteur);

        assertNotNull(updatedResult);
        assertEquals(updatedConducteur, updatedResult);
    }
}
