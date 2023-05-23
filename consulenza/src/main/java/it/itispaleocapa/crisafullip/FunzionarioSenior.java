package it.itispaleocapa.crisafullip;

class FunzionarioSenior extends Personale{
    
    public static double costoOrario = 80;

    FunzionarioSenior(int code, String n, String c, int aA){
        super(code, n, c, aA);
    }

    @Override
    public double getCostoOrario(){
        return costoOrario;
    }    
}
