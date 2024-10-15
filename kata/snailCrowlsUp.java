public class Kata {
    public static int snail(int column, int day, int night) {
      int days = 1;
      while(day < column){
        column -= (day - night);
        days++;
      }
      return days;
    }
}