package it.itispaleocapa.crisafullip;

class FunzionarioJunior extends Personale{
    
    public static double costoOrario = 70;

    FunzionarioJunior(int code, String n, String c, int aA){
        super(code, n, c, aA);
    }

    @Override
    public double getCostoOrario(){
        return costoOrario;
    }
}
