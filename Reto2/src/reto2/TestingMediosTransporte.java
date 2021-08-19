package reto2;

public class TestingMediosTransporte {

    public static void main(String[] args) {

        // Start
        // Case 1
        System.out.println("-----Nuevo Taxi------");
       
        Taxi t = new Taxi("Pepe");
        
        t.gestionarMotor();
        t.recogerPasajero();
        t.gestionarSeguros();
        t.gestionarMarcha();
        t.moverAbajo(5);
        t.moverDerecha(6);
        t.moverIzquierda(2);
        t.gestionarSeguros();
        t.gestionarMarcha();
        t.dejarPasajero();
        t.dejarPasajero();
        t.gestionarSeguros();
        t.dejarPasajero();
        t.recogerPasajero();
        t.gestionarSeguros();
        t.moverArriba(1);
        t.gestionarMarcha();
        t.gestionarSeguros();
        t.dejarPasajero();
               
        System.out.println(t.getNombreConductor());
        System.out.println(t.getnPasajeros());
        System.out.println(t.getCantidadDinero());
        System.out.println(t.getnMaximoPasajeros());
        System.out.println(t.getLocalizacionX());
        System.out.println(t.getLocalizacionY());
        System.out.println(t.isAireAcondicionadoActivado());
        System.out.println(t.isMotorEncendido());
        System.out.println(t.isWifiEncendido());
        System.out.println(t.isEnMarcha());
        System.out.println(t.getDistanciaRecorrida());
        System.out.println(t.isSegurosActivados());
        
   
    }

}
