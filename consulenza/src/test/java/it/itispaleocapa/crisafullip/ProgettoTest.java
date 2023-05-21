package it.itispaleocapa.crisafullip;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class ProgettoTest {
    @Test
    public void testGetCostoComplessivo() throws MembroNonEsistenteException {
        Progetto progetto = new Progetto();

        // Creazione dei membri del personale
        Personale membro1 = new Personale(1, "Rossi", "Mario", 2010, true, Area.informatica, Ruolo.Tecnico);
        Personale membro2 = new Personale(2, "Bianchi", "Luca", 2015, false, Area.elettronica, Ruolo.Dirigente);
        Personale membro3 = new Personale(3, "Verdi", "Laura", 2018, true, Area.informatica, Ruolo.FunzionarioJunior);

        // Aggiunta dei membri al progetto
        progetto.aggiungiPersonale(membro1);
        progetto.aggiungiPersonale(membro2);
        progetto.aggiungiPersonale(membro3);

        // Calcolo del costo complessivo
        double costoComplessivo = progetto.getCostoComplessivo();

        // Verifica del risultato atteso
        double costoComplessivoTestato = (40 * (40 + (2023 - 2010))) + 100 + 70;
        Assert.assertEquals(costoComplessivoTestato, costoComplessivo, 0.01);
    }

    @Test
    public void testGetCostoOrario() throws MembroNonEsistenteException {
        Progetto progetto = new Progetto();

        // Creazione di un membro del personale
        Personale membro = new Personale(1, "Rossi", "Mario", 2010, true, Area.informatica, Ruolo.Tecnico);
        double costoOrario = progetto.getCostoOrario(membro);

        
        double costoOrarioTestato = 40;
        Assert.assertEquals(costoOrarioTestato, costoOrario, 0.01);
    }
}
