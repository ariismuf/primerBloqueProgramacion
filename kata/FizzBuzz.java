public class FizzBuzz{
    public static int[] solution(int number) {
      
      int A = 0;
      int B = 0;
      int C = 0;
               for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                C++;
            } else if (i % 3 == 0) {
                A++;
            } else if (i % 5 == 0) {
                B++;
            }
        }
         
         return new int[] {A, B, C}; 
        }
         
      
        }