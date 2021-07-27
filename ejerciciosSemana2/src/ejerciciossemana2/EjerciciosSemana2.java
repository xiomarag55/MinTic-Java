
package ejerciciossemana2;

import java.util.Arrays;

public class EjerciciosSemana2 {

    public static void main(String[] args) {
        
        int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        
        int suma [] = new int[v1.length];
        int total = 0;
        for(int i = 0; i < suma.length; i++){
            suma[i] = v1[i] + v2[i];
            total += suma[i];
            
        }
        System.out.println(Arrays.toString(suma));
    }
    
}
