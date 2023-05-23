package it.itispaleocapa.crisafullip;



public abstract class Personale {
    public int codice;
    public String nome;
    public String cognome;
    public int annoAssunzione;

    public Personale(int code, String n, String c, int aA){
        this.codice = code;
        this.cognome = c;
        this.nome = n;
        this.annoAssunzione = aA;
    }

    //metodo che posso utilizzare in tutte le altri classi dipendenti da questa
    public abstract double getCostoOrario();


    public String getCodice() {
        return "C" + codice;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnnoInizio() {
        return annoAssunzione;
    }
}


