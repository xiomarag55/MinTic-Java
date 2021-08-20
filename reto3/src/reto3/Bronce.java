
package reto3;

public class Bronce extends Asiento {
    
    public Bronce(){
        super();
    }
    public Bronce(String ID, char tipo){
        super( ID, tipo);
        
    }
    @Override
    public String imprimirMenuPantalla(){
        return "BRONCE";
    }
    
}
