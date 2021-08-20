
package reto3;

public class Reto3 {

    public static void main(String[] args) {
        
        Bronce num1 = new Bronce("23445",'b');
        
        num1.setInclinacionSilla(100);
        num1.aumentarInclinacion(20);
        num1.disminuirInclinacion(110);
        System.out.println(num1.getInclinacionSilla());
    }
    
}
