
package reto1;

public class SimCard {
    
    private String empresaTelefonia = "HI";
    private double saldo = 0;
    private String numeroTelefono;
    private boolean celularApagado = true;
    private boolean modoAvionActivado = false;
    private boolean datosActivados = false;
    private int saldoDatos = 0;
    

    public SimCard(){

    }
    public SimCard(String numeroTelefono){

        this.numeroTelefono = numeroTelefono;
        
    
        }
    public String getEmpresaTelefonia(){
        return empresaTelefonia;
    }

    public void setEmpresaTelefonia(String empresaTelefonia){
        this.empresaTelefonia = empresaTelefonia;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    
    public boolean isCelularApagado(){
        return celularApagado;
    }

    public void setCelularApagado(boolean celularApagado){
        this.celularApagado = celularApagado;
    }
  
    public boolean isModoAvionActivado(){
        return modoAvionActivado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado){
        this.modoAvionActivado = modoAvionActivado;
    }
    
    public boolean isDatosActivados(){
        return datosActivados;
    }

    public void setDatosActivados(boolean datosActivados){
        this.datosActivados = datosActivados;
    }
    
    public int getSaldoDatos(){
        return saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos){
        this.saldoDatos = saldoDatos;
    }
  



    public void comprarDatos(int c){
        if (c <= 10){
            int costo = c * 3000;
            if (costo > saldo){
                System.out.println("No tienes saldo suficiente");
            }else{
                saldo -= c * 3000;
                saldoDatos += c;
            }
        }
        else if(c >10 && c <= 30){
           int costo = 10*3000 + (c-10)*2500;
           if (costo > saldo){
                System.out.println("No tienes saldo suficiente");
            }else{
                saldo -= 10*3000 + (c-10)*2500;
                saldoDatos += c;
            }
        
    }else{
            int costo = 20*3000 + (c-20)*1500;
            
            if (costo > saldo){
                System.out.println("No tienes saldo suficiente");
            }else{
                saldo -= 20*3000 + (c-20)*1500;
                saldoDatos += c;
            }
            
            
       
     
    }
        
    }
    public void consumirDatos(int c){
        
        if (celularApagado == true ||modoAvionActivado == true ){
            saldoDatos = saldoDatos;

        }else if(datosActivados == false && modoAvionActivado == false || datosActivados == true && modoAvionActivado == true ){
            saldoDatos = saldoDatos;
        }else{
            saldoDatos -= c;
        }
        
    }
    public void llamar(int s){

        if (celularApagado == true ||modoAvionActivado == true ){
            System.out.println("Red no disponible");

        }else{
           
            if (s <= 60){
                saldo -= s;
            }else{
                saldo -= 60 +(s-60)*0.5;
            }
        }
        
    }
    public void recargarSaldo(double s){
        saldo += s;
        
    }
    public void gestionarEncendidoCelular(){
        if (celularApagado == true ){
            celularApagado = false;
            modoAvionActivado = false;
            datosActivados = false;
            
            
        }else{
            celularApagado = true;
            modoAvionActivado = false;
            datosActivados = false;
        }
        
    }
    public void gestionarModoAvion(){
        
        if (modoAvionActivado == true){
            modoAvionActivado = false;
        }else{
            modoAvionActivado = true;
        }
        
    }
    public void gestionarDatos(){
        if (modoAvionActivado == true && datosActivados == true){
           datosActivados = false;
        }else if(modoAvionActivado == true && datosActivados == false) {
            datosActivados = false;
        }else{
            datosActivados = true;
        }
      
    }
    
}
