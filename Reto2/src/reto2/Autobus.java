package reto2;

public class Autobus extends Vehiculo {

    private boolean puertaAbierta;

    public Autobus() {
        super();
    }

    public Autobus(String nombreConductor) {
        super(nombreConductor, 30);
    }

    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
    }

    public void recogerPasajero(int estrato) {
if(this.puertaAbierta){
    if (this.getnPasajeros() < this.getnMaximoPasajeros()) {
            this.setCantidadDinero(this.getCantidadDinero() + this.calcularPasaje(estrato));
            this.setnPasajeros(this.getnPasajeros() + 1);
        }
}
       

    }

    public void gestionarPuerta() {
        if (!this.isEnMarcha() && !puertaAbierta) {
            puertaAbierta = true;
        } else {
            puertaAbierta = false;
        }
    }

    // gestionarMarcha hereda de Vehiculo
    @Override
    public void gestionarMarcha() {
        if (!this.isEnMarcha() && !puertaAbierta) {
            this.setEnMarcha(true);
        } else {
            this.setEnMarcha(false);
        }
    }

    public double calcularPasaje(int estrato) {
        if (estrato > 0 && estrato < 3) {
            return 1500;
        } else if (estrato > 2 && estrato < 5) {
            return 2600;
        } else {
            return 3000;
        }
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
}
