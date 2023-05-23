package it.itispaleocapa.crisafullip;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgettoTest {
   

    
    @Test
    public void testAggiungiMembro() throws MembroNonValidoException {
        Progetto p = new Progetto();
        Personale membro1 = new Dirigente(1, "Pasquale", "Crisafulli", 2010);
        Personale membro2 = new FunzionarioJunior(2, "Samuele", "Labollita", 2015);
        p.aggiungiMembro(membro1);
        p.aggiungiMembro(membro2);
        
        Assertions.assertEquals(2, p.membri.size());
        Assertions.assertTrue(p.membri.containsKey("C1"));
        Assertions.assertTrue(p.membri.containsKey("C2"));
    }

    @Test
    public void testAggiungiMembroDuplicato() throws MembroNonValidoException {
        Progetto p = new Progetto();
        Personale membro = new Dirigente(1, "Pasquale", "Crisafulli", 2010);

            p.aggiungiMembro(membro);
            Assertions.assertEquals(1, p.membri.size());
            Assertions.assertTrue(p.membri.containsKey("C1"));
    }

    @Test
    public void testGetCostoComplessivoProgetto() throws MembroNonValidoException {
        Progetto p = new Progetto();
        Personale membro1 = new Dirigente(1, "Mario", "Rossi", 2010);
        Personale membro2 = new FunzionarioJunior(2, "Luigi", "Verdi", 2015);
        
        p.aggiungiMembro(membro1);
        p.aggiungiMembro(membro2);
        double costoComplessivo = p.getCostoComplessivoProgetto();
        Assertions.assertEquals(170, costoComplessivo);
    }
}

