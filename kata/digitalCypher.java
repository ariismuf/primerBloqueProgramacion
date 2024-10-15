public class Solution{
    public static int[] encode(String message, int key) {
      String keyString = Integer.toString(key);
        int[] keyDigits = new int [keyString.length()];
        for (int i = 0; i < keyString.length(); i++) {
          keyDigits[i] = Character.getNumericValue(keyString.charAt(i));
        }
        
        int[] encoded = new int[message.length()];
        
        for (int i = 0; i < message.length(); i++) {
          int letterValue = message.charAt(i) - 'a' +1;
          
          int keyDigit = keyDigits[i % keyDigits.length];
          encoded[i] = letterValue + keyDigit;
        
        }
            
  return encoded;
    }
  }