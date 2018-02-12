public class RandomDinner
{
   public static void main(String[] args)
   {
      
      DinnerPlaces [] dinnerPlaces = new DinnerPlaces[19];
      for (int i =0;i<dinnerPlaces.length;i++)
      {
         dinnerPlaces[i] = new DinnerPlaces(i);
      }
      dinnerPlaces[0].setName("CPK");
      dinnerPlaces[0].setLocation("Arden-Arcade");
      dinnerPlaces[0].setCategory("Pizza");
      dinnerPlaces[0].setPrice("$$");
      
      dinnerPlaces[1].setName("Bento Box");
      dinnerPlaces[1].setLocation("65th");
      dinnerPlaces[1].setCategory("Japanese");
      dinnerPlaces[1].setPrice("$");
      
      dinnerPlaces[2].setName("MOD Pizza");
      dinnerPlaces[2].setLocation("Arden-Arcade");
      dinnerPlaces[2].setCategory("Pizza");
      dinnerPlaces[2].setPrice("$");
      
      dinnerPlaces[3].setName("Cafe 15L");
      dinnerPlaces[3].setLocation("Midtown");
      dinnerPlaces[3].setCategory("Modern");
      dinnerPlaces[3].setPrice("$$");
      
      dinnerPlaces[4].setName("Buca di Beppo");
      dinnerPlaces[4].setLocation("Arden-Arcade");
      dinnerPlaces[4].setCategory("Italian");
      dinnerPlaces[4].setPrice("$$");
      
      dinnerPlaces[5].setName("Iron Horse Tavern");
      dinnerPlaces[5].setLocation("Midtown");
      dinnerPlaces[5].setCategory("Modern American");
      dinnerPlaces[5].setPrice("$$");
      
      dinnerPlaces[6].setName("Hook & Ladder");
      dinnerPlaces[6].setLocation("Midtown");
      dinnerPlaces[6].setCategory("Modern American");
      dinnerPlaces[6].setPrice("$$");
      
      dinnerPlaces[7].setName("Cafe Rolle");
      dinnerPlaces[7].setLocation("East");
      dinnerPlaces[7].setCategory("French");
      dinnerPlaces[7].setPrice("$$");
      
      dinnerPlaces[8].setName("Red Rabbit");
      dinnerPlaces[8].setLocation("Midtown");
      dinnerPlaces[8].setCategory("Modern American");
      dinnerPlaces[8].setPrice("$$");
      
      dinnerPlaces[9].setName("Pushkins");
      dinnerPlaces[9].setLocation("Midtown");
      dinnerPlaces[9].setCategory("Brunch");
      dinnerPlaces[9].setPrice("$$");
      
      dinnerPlaces[10].setName("Chando's Tacos");
      dinnerPlaces[10].setLocation("South");
      dinnerPlaces[10].setCategory("Mexican");
      dinnerPlaces[10].setPrice("$");
      
      dinnerPlaces[11].setName("Chipotle");
      dinnerPlaces[11].setLocation("Fair Oaks");
      dinnerPlaces[11].setCategory("Mexican-ish");
      dinnerPlaces[11].setPrice("$");
      
      dinnerPlaces[12].setName("Tower Cafe");
      dinnerPlaces[12].setLocation("Midtown");
      dinnerPlaces[12].setCategory("Modern, everything really");
      dinnerPlaces[12].setPrice("$$");
      
      dinnerPlaces[13].setName("Evan's Kitchen");
      dinnerPlaces[13].setLocation("East");
      dinnerPlaces[13].setCategory("Modern American");
      dinnerPlaces[13].setPrice("$$");
      
      dinnerPlaces[14].setName("La Bou");
      dinnerPlaces[14].setLocation("Arden-Arcade");
      dinnerPlaces[14].setCategory("Cafe");
      dinnerPlaces[14].setPrice("$");
      
      dinnerPlaces[15].setName("Burgers and Brew");
      dinnerPlaces[15].setLocation("Midtown");
      dinnerPlaces[15].setCategory("American");
      dinnerPlaces[15].setPrice("$");
      
      dinnerPlaces[16].setName("OBO's");
      dinnerPlaces[16].setLocation("Midtown");
      dinnerPlaces[16].setCategory("Italian");
      dinnerPlaces[16].setPrice("$$");
      
      dinnerPlaces[17].setName("Eatuscany");
      dinnerPlaces[17].setLocation("Midtown");
      dinnerPlaces[17].setCategory("Italian");
      dinnerPlaces[17].setPrice("$");
      
      dinnerPlaces[18].setName("Paesanos");
      dinnerPlaces[18].setLocation("Midtown");
      dinnerPlaces[18].setCategory("Italian");
      dinnerPlaces[18].setPrice("$");
      
      pickRandomDinner(dinnerPlaces);
   }
   public static void pickRandomDinner(DinnerPlaces[] dinnerPlaces)
   {
      int max = 18;
      int min = 0;
      int randomNumber=(int)(Math.random()*(max-min)+min);
      System.out.print("The dinner place randomly selected is "
         + dinnerPlaces[randomNumber].getName() + ". \nIt is located in the "
         + dinnerPlaces[randomNumber].getLocation() + " area of Sacramento. \nIt's category is "
         + dinnerPlaces[randomNumber].getCategory() + " and the price point is "
         + dinnerPlaces[randomNumber].getPrice()
         + ".\nEnjoy!");
   }
}

class DinnerPlaces
{
   int pKey;
   String name;
   String location;
   String category;
   String price;
   
   DinnerPlaces(int number)
   {
      pKey=number;
   }
   
   public void setName(String inputName)
   {
      name=inputName;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setLocation(String inputLocation)
   {
      location=inputLocation;
   }

   public String getLocation()
   {
      return location;
   }

   public void setCategory(String inputCategory)
   {
      category=inputCategory;
   }

   public String getCategory()
   {
      return category;
   }
   public void setPrice(String inputPrice)
   {
      price=inputPrice;
   }
   
   public String getPrice()
   {
      return price;
   }
}
