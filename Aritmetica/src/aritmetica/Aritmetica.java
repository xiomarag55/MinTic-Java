package aritmetica;

import java.util.Arrays;
import java.util.Collections;

public class Aritmetica {

    public static void main(String[] args) {

        int[] a = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int temporal = 0;

        int tam = a.length;

        for (int i = 0; i < tam / 2; i++) {
            for (int j = 1; j < (tam / 2 - i); j++) {
                if (a[j - 1] > a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        for (int i = (tam / 2); i < tam; i++) {
            for (int j = (tam / 2)+1; j < (tam); j++) {
                if (a[j - 1] < a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }

}
