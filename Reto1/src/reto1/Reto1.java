
package reto1;


public class Reto1 {

    public static void main(String[] args) {
        
        SimCard celular1 = new SimCard("3218829132");
        
        
        celular1.recargarSaldo(50000);
        celular1.comprarDatos(12);
        celular1.gestionarEncendidoCelular();
        celular1.llamar(120);
        celular1.gestionarModoAvion();
        celular1.gestionarDatos();
        celular1.gestionarModoAvion();
        celular1.gestionarDatos();
        celular1.consumirDatos(3);
        celular1.gestionarEncendidoCelular();
        
        System.out.println(celular1.getEmpresaTelefonia());
        System.out.println(celular1.getSaldo());
        System.out.println(celular1.getNumeroTelefono());
        System.out.println(celular1.isCelularApagado());
        System.out.println(celular1.isModoAvionActivado());
        System.out.println(celular1.isDatosActivados());
        System.out.println(celular1.getSaldoDatos());
    }
}
