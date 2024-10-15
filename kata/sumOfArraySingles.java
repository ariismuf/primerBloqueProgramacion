

public class Solution {
    public static int repeats(int[] array) {
        int suma = 0;
      for (int i = 0; i < array.length; i ++ ){
        int contador = 0;
        for (int j = 0; j < array.length; j++){
          if (array[i] == array[j]){
            contador++;
          }
        
      }
      if (contador == 1){
        suma += array[i];
      }
    }
      return suma;
    }
}