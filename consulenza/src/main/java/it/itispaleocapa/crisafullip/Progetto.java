
package it.itispaleocapa.crisafullip;

import java.util.HashMap;
import java.util.LinkedList;


public class Progetto{
    private LinkedList<Personale> membriPersonale;
    private HashMap<Ruolo, Integer> costiOrari;

    public Progetto() {
        membriPersonale = new LinkedList<>();
        costiOrari = new HashMap<>();

        costiOrari.put(Ruolo.Dirigente, 100);
        costiOrari.put(Ruolo.FunzionarioJunior, 70);
        costiOrari.put(Ruolo.FunzionarioSenior, 80);
        costiOrari.put(Ruolo.Tecnico, 0);
    }

    public void aggiungiPersonale(Personale membro){
        membriPersonale.add(membro);
    }

    public LinkedList<Personale> getPersonale() {
        LinkedList<Personale> membriPersonale = new LinkedList<>();
        membriPersonale.add(new Personale(1, "Rossi", "Mario", 2010, true, Area.informatica, Ruolo.Tecnico));
        membriPersonale.add(new Personale(2, "Bianchi", "Luca", 2015, false, Area.elettronica, Ruolo.Dirigente));
        membriPersonale.add(new Personale(3, "Verdi", "Laura", 2018, true, Area.informatica, Ruolo.FunzionarioJunior));
        return membriPersonale;
    }

    public double getCostoComplessivo()throws MembroNonEsistenteException{
        
        LinkedList<Personale> membriPersonale = getPersonale();
        if (membriPersonale.isEmpty()) {
            throw new MembroNonEsistenteException();
        }
        double costoComplessivo = 0;

        for (Personale membro : membriPersonale) {
            double costoOrario = getCostoOrario(membro);
            int oreAttività = getOreAttività(membro);
            costoComplessivo += costoOrario * oreAttività;
        }

        return costoComplessivo;
    }

    public double getCostoOrario(Personale membro) throws MembroNonEsistenteException{
        LinkedList<Personale> membriPersonale = getPersonale();
        if (membriPersonale.isEmpty()) {
            throw new MembroNonEsistenteException();
        }

        Ruolo ruolo = membro.getRuolo();
        double costoOrario = costiOrari.get(ruolo);

        if (membro.isInterno() && ruolo == Ruolo.Tecnico) {
            int anniTrascorsi = 2023 - membro.getAnnoAssunzione();
            double incrementoPerAnni = anniTrascorsi * 1;
            costoOrario += incrementoPerAnni;
        }

        return costoOrario;
    }

    private int getOreAttività(Personale membro){
        return 40;
    } 
}
