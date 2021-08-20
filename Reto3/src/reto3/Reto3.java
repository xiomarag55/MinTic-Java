
package reto3;

public class Reto3 {

    public static void main(String[] args) {
        
        Bronce silla1 = new Bronce("0001",'B');
        silla1.setInclinacionSilla(100);
        silla1.aumentarInclinacion(100);
        
        System.out.println("Inclinación: "+ silla1.getInclinacionSilla());
        silla1.disminuirInclinacion(23);
        System.out.println("Inclinación: "+ silla1.getInclinacionSilla()) ;
    }
    
}
