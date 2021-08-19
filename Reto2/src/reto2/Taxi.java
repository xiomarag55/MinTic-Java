package reto2;

public class Taxi extends Vehiculo {

    private double distanciaRecorrida = 0;
    private boolean segurosActivados;

    public Taxi() {
        super();
    }

    public Taxi(String nombreConductor) {
        super(nombreConductor, 1);
    }

    public void reiniciarTaximetro() {
        distanciaRecorrida = 0;
    }

    public void presionarBotonPanico() {
        this.setEnMarcha(false);
        this.setSegurosActivados(false);
        this.setCantidadDinero(0);
        this.setnPasajeros(0);
        
    }

    //dejarPasajero hereda de vehiculo
    @Override
    public void dejarPasajero() {
        if(!segurosActivados){
            this.setnPasajeros(0);
            this.setCantidadDinero(this.getCantidadDinero() + this.calcularPasaje());
            this.reiniciarTaximetro();
        } 
    }

    public void recogerPasajero() {
        if(this.getnPasajeros() < 1){
            this.setnPasajeros(this.getnPasajeros() + 1);
        }
    }

    @Override
    public void gestionarMarcha() {
        if (!this.isEnMarcha() && segurosActivados) {
            this.setEnMarcha(true);
        } else {
            this.setEnMarcha(false);
        }
    }

    @Override
    public void moverDerecha(double d) {
        if (this.isEnMarcha()) {
            this.setLocalizacionX(this.getLocalizacionX() + d);
            if (this.getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverIzquierda(double d) {
        if (this.isEnMarcha()) {
            this.setLocalizacionX(this.getLocalizacionX() - d);
            if (this.getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverArriba(double d) {
        if (this.isEnMarcha()) {
            this.setLocalizacionY(this.getLocalizacionY() + d);
            if (this.getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverAbajo(double d) {
        if (this.isEnMarcha()) {
            this.setLocalizacionY(this.getLocalizacionY() - d);
            if (this.getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

    public double calcularPasaje() {
        if(distanciaRecorrida > 0){
            return 3000 + (2300 * distanciaRecorrida);
        }
        return 0;
    }

    public void gestionarSeguros() {
        if (!this.isEnMarcha() && segurosActivados) {
            segurosActivados = false;
        } else {
            segurosActivados = true;
        }
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }

    
}
