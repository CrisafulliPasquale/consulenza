
package it.itispaleocapa.crisafullip;

import java.util.HashMap;



public class Progetto{
    public HashMap<String, Personale> membri;

    public Progetto() {
        membri = new HashMap<>();
    }

    public void aggiungiMembro(Personale membro) throws MembroNonValidoException {
        if (membri.containsKey(membro.getCodice())) {
            throw new MembroNonValidoException();
        }

        membri.put(membro.getCodice(), membro);
    }

    public double getCostoComplessivoProgetto() {
        double costoComplessivo = 0;

        for (Personale membro : membri.values()) {
            costoComplessivo += membro.getCostoOrario();
        }
        return costoComplessivo;
    }
}
