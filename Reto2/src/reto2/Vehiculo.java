package reto2;

public abstract class Vehiculo {

    private String nombreConductor;
    private int nPasajeros = 0;
    private int nMaximoPasajeros;
    private double cantidadDinero = 0;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    public Vehiculo() {
    }

    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public void dejarPasajero() {
        nPasajeros -= 1;
    }

    public double calcularDistanciaAcopio() {
        double distancia = Math.sqrt((localizacionX * localizacionX) + (localizacionY * localizacionY));
        return distancia;

    }

    public void gestionarAireAcondicionado() {
        if (motorEncendido && !aireAcondicionadoActivado) {
            aireAcondicionadoActivado = true;
        } else {
            aireAcondicionadoActivado = false;
        }
    }

    public void gestionarMotor() {
        if (!motorEncendido) {
            motorEncendido = true;
        } else {
            wifiEncendido = false;
            aireAcondicionadoActivado = false;
            enMarcha = false;
            motorEncendido = false;
        }
    }

    public void gestionarWifi() {
        if (motorEncendido && !wifiEncendido) {
            wifiEncendido = true;
        } else {
            wifiEncendido = false;
        }
    }

    public abstract void gestionarMarcha();

    public void moverDerecha(double d) {
        if (enMarcha) {
            localizacionX += d;
        }
    }

    public void moverIzquierda(double d) {
        if (enMarcha) {
            localizacionX -= d;
        }
    }

    public void moverArriba(double d) {
        if (enMarcha) {
            localizacionY += d;
        }
    }

    public void moverAbajo(double d) {
        if (enMarcha) {
            localizacionY -= d;
        }
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
}
