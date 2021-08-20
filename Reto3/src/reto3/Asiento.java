
package reto3;

public abstract class Asiento {
    
    private char tipo;
    private String ID;
    private boolean pantallaEncendida;
    private double inclinacionSilla = 90;
    private boolean luzLecturaEncendida;
    private boolean luzAsistenciaEncendida;
    private boolean aireAcondicionadoEncendido;
    
    public Asiento(){
        
    }

    public Asiento(String ID, char tipo) {
        this.tipo = tipo;
        this.ID = ID; 
    }
    public void gestionarAireAcondicionado(){
        if (!aireAcondicionadoEncendido) {
            aireAcondicionadoEncendido = true;

        } else {
            aireAcondicionadoEncendido = false;
        }
    }
    public void gestionarPantalla(){
        if (!pantallaEncendida) {
            pantallaEncendida = true;

        } else {
            pantallaEncendida = false;
        }
    }
    public void gestionarLuzLectura(){
        if (!luzLecturaEncendida) {
            luzLecturaEncendida = true;

        } else {
            luzLecturaEncendida = false;
        }
    }
    public void gestionarLuzAsistencia(){
        if (!luzAsistenciaEncendida) {
            luzAsistenciaEncendida = true;

        } else {
            luzAsistenciaEncendida = false;
        }
    }
    public void aumentarInclinacion(double d){
         if (inclinacionSilla + d > 135) {
            inclinacionSilla  = 135;
         }else{
             inclinacionSilla += d;
         }
        
    }
    public void disminuirInclinacion(double d){
        
         if(inclinacionSilla - d < 0){
             inclinacionSilla = 0;
             
         }else{
             inclinacionSilla -= d;
         }
        
    }
    public abstract String imprimirMenuPantalla();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncendida() {
        return luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }
    
    
    
}



