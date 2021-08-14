
package reto2;

public class Vehiculo {
    
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
    
    public Vehiculo(){
        
    }
    public Vehiculo(String nombreConductor, int nMaximoPasajeros){
        
        this.nombreConductor  = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
    }
    
    public void dejarPasajero(){
        if (enMarcha == true){
            nPasajeros = nPasajeros;
            
        }else{
            nPasajeros -= 1;
        }
        
    }
    public double calcularDistanciaAcopio(){
        
    }
    public void gestionarAireAcondicionado(){
        
    }
    public void gestionarMotor(){
        
    }
    public void gestionarWifi(){
        
    }
    public void gestionarMarcha(){
        if()
        
    }
    public void moverDerecha(double d){
        
    }
    public void moverIzquierda(double d){
        
    }
    public void moverArriba(double d){
        
    }
    public void moverAbajo(double d){
        
    }
   
    
    
}
