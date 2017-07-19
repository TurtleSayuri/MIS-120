//Melissa deCastro
//April 13, 2017
//Chapter 9 Homework - 9.2 (pg 360)

public class Stock_deCastro
{

   public static void main(String[] args)
   {
      Stock stock1 = new Stock("ORCL", "Oracle Corporation");
      //Stock name = new Stock();
      //System.out.println(stock1.getSymbol() + stock1.getName());
      stock1.getPercentChange(34.5, 34.35);
      System.out.printf("For the stock " + stock1.getSymbol()
         + ", which stands for " + stock1.getName() + ", \nthe previous closing price was "
         + stock1.getPreviousClosingPrice(34.5) + " and the current price is \n"
         + stock1.getCurrentPrice(34.35) + ", so the price-change percentage is %.6f",
         stock1.getPercentChange(34.5, 34.35));
   }

}

class Stock
{
   String symbol;
   String name;
   double previousClosingPrice;
   double currentPrice;
   Stock(String inputSymbol, String inputName)
   {
      symbol=inputSymbol;
      name=inputName;
   }
   
   double getPercentChange(double previousClosingPrice, double currentPrice)
   {
      double percentChange= ((currentPrice-previousClosingPrice)/previousClosingPrice);
      return percentChange;
   }
   
   public String getSymbol()
   {
      return symbol;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getPreviousClosingPrice(double inputPreviousClosingPrice)
   {
      previousClosingPrice=inputPreviousClosingPrice;
      return previousClosingPrice;
   }
   
   public double getCurrentPrice(double inputCurrentPrice)
   {
      currentPrice=inputCurrentPrice;
      return currentPrice;
   }
   
}