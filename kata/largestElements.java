import java.util.*;
public class Solution {
  
   public static int[] largest(int n, int[] arr) {
     Arrays.sort(arr);
     return Arrays.copyOfRange(arr,arr.length-n,arr.length);
   }
}