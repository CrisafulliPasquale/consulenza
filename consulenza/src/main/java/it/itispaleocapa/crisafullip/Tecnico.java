package it.itispaleocapa.crisafullip;


class Tecnico extends Personale{
    private static double costoOrarioInternoIT= 40; //informatica e telecomunicazioni
    private static double costoOrarioInternoEA = 50; //elettronica automazioni
    private static double costoOrarioEsterno = 0;
    private static final int ANNO_CORRENTE = 2023;

    public enum Specializzazione {
        InformaticaTelecomunicazioni("Informatica-Telecomunicazioni"),
        ElettronicaAutomazioni("Elettronica-Automazione");

        private final String nome;

        Specializzazione(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public Specializzazione specializzazione;
    public boolean interno; //true I | false E

    public Tecnico(int code, String n, String c, int aA, Specializzazione specializzazione, boolean interno) {
        super(code, n, c, aA);
        this.specializzazione = specializzazione;
        this.interno = interno;
    }

    public Specializzazione getSpecializzazione() {
        return specializzazione;
    }

    public boolean isInterno() {
        return interno;
    }

    @Override
    public double getCostoOrario() {
        double costoOrario = 0;
        int anniLavoro;
        if (interno) {
            if (specializzazione == Specializzazione.InformaticaTelecomunicazioni) {
                costoOrario = costoOrarioInternoIT;
            } else if (specializzazione == Specializzazione.ElettronicaAutomazioni) {
                costoOrario = costoOrarioInternoEA;
            }
        } else {
            costoOrario = costoOrarioEsterno;
        }

        anniLavoro = ANNO_CORRENTE - annoAssunzione;
        costoOrario += anniLavoro;

        return costoOrario;
    }
}
    

