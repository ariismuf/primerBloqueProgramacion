import static java.util.regex.Pattern.matches;

public class Kata { 

  public static String getIssuer(String cn) {
    if (cn.matches("^3[4|7].{13}$")) return "AMEX";
    if (cn.matches("^6011.{12}$")) return "Discover";
    if (cn.matches("^5[1-5].{14}$")) return "Mastercard";
    if (cn.matches("^4.{12}(...)?$")) return "VISA";
    return "Unknown";
  }
  
}