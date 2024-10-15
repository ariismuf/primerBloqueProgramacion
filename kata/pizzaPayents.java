public class PizzaPayments {
    public static double michaelPays(double cost) {
      if (cost<=5){
        return Math.round(cost *100)/100.00;
      }
      else if (cost / 3 >= 10){
        return Math.round((cost -10)*100)/100.00;
      } 
      else if (cost / 3 <= 10){
        double kateCost = cost /3;
        return Math.round((cost -kateCost)*100)/ 100.00;
      }
      else{
        return  cost;
      }
      
    }
  }