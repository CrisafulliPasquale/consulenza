package it.itispaleocapa.crisafullip;

enum Area {
    informatica,
    elettronica
}

enum Ruolo {
    Dirigente,
    FunzionarioJunior,
    FunzionarioSenior,
    Tecnico
}

public class Personale {
    private int codice;
    private String cognome;
    private String nome;
    private int annoAssunzione;
    private boolean interno;
    private Area area;
    private Ruolo ruolo;

    public Personale(int codice, String cognome, String nome, int annoAssunzione, boolean interno, Area area, Ruolo ruolo) {
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
        this.annoAssunzione = annoAssunzione;
        this.interno = interno;
        this.area = area;
        this.ruolo = ruolo;
    }

    public int getCodice() {
        return codice;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnnoAssunzione() {
        return annoAssunzione;
    }

    public boolean isInterno() {
        return interno;
    }

    public Area getArea() {
        return area;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    @Override
    public String toString() {
        return "Operaio con: " + " codice:" + codice +", " + cognome + '\'' +", " + nome + '\'' +", annoAssunzione: " + annoAssunzione + ", interno:" + interno +", area: " + area +", ruolo: " + ruolo;
    }
}

class MembroNonEsistenteException extends Exception{}
