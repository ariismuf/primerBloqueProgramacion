public class Kata{
    public static String alphabetWar(String fight){
      int leftPower = 0;
      int rightPower =0;
      
      for(char letter : fight.toCharArray()) {
        switch (letter){
            case 'w':leftPower += 4; break;
            case 'p':leftPower += 3; break;
            case 'b':leftPower += 2; break;
            case 's':leftPower += 1; break;
            
            case 'm':rightPower += 4; break;
            case 'q':rightPower += 3; break;
            case 'd':rightPower += 2; break;
            case 'z':rightPower += 1; break;
            default: break;
        }
      }
      
      if (leftPower > rightPower){
        return "Left side wins!";
      }
      else if (leftPower < rightPower){
        return "Right side wins!";
      }
      else {
        return "Let's fight again!";
        }
    }
}