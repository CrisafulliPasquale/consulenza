package it.itispaleocapa.crisafullip;

class Dirigente extends Personale{

    public static double costoOrario = 100;

    Dirigente(int code, String n, String c, int aA){
        super(code, n, c, aA);
    }

    @Override
    public double getCostoOrario() {
        return costoOrario;
    }
    
}
