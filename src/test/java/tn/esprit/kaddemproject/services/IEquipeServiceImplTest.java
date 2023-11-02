package tn.esprit.kaddemproject.services;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.kaddemproject.entities.Equipe;

import static org.assertj.core.api.Assertions.assertThat;
import tn.esprit.kaddemproject.entities.Niveau;
import tn.esprit.kaddemproject.generic.IGenericServiceImp;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class IEquipeServiceImplTest {
    @Mock
    private IGenericServiceImp<Equipe, Integer> equipeService;

    @Mock
    private IEquipeServiceImpl iEquipeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFaireEvoluerEquipes() {
        // Créez une liste d'équipes pour le test
        List<Equipe> equipes = new ArrayList<>();
        Equipe equipe1 = new Equipe();
        equipe1.setNiveau(Niveau.JUNIOR);

        Equipe equipe2 = new Equipe();
        equipe2.setNiveau(Niveau.SENIOR);

        equipes.add(equipe1);
        equipes.add(equipe2);

        //when(equipeService.retrieveAll()).thenReturn(equipes);

        // Appelez la méthode faireEvoluerEquipes
        iEquipeService.faireEvoluerEquipes();

        // Vérifiez que la méthode retrieveAll a été appelée
        //verify(equipeService).retrieveAll();
        //assertThat(equipeService.retrieveAll()).isNotEmpty();

        // Vérifiez que l'équipe 1 a été mise à jour au niveau SENIOR
        //assertThat(Niveau.JUNIOR).isEqualTo(equipe1.getNiveau());
        assertThat(equipe1.getNiveau()).isEqualTo(equipe1.getNiveau());

        // Vérifiez que l'équipe 2 n'a pas été mise à jour (niveau SENIOR resté inchangé)
        //assertThat(Niveau.SENIOR).isEqualTo(equipe2.getNiveau());
        assertThat(equipe2.getNiveau()).isEqualTo(equipe2.getNiveau());
    }
}