public class TestSimpleCircle
{
   public static void main(String[] args)
   {
      //make circle with radius of 1
      SimpleCircle circle1 = new SimpleCircle();
      System.out.println("The area of the circle of radius "
         + circle1.radius + " is " + circle1.getArea());
      //make circle with radius of 18
      SimpleCircle circle2 = new SimpleCircle(18);
      System.out.println("The area of the circle of radius "
         + circle2.radius + " is " + circle2.getArea());
      //make circle with radius of 181
      SimpleCircle circle3 = new SimpleCircle(181);
      System.out.println("The area of the circle of radius "
         + circle3.radius + " is " + circle3.getArea());
      //modify circle radius to 100
      circle3.setRadius(100);
      System.out.println("The area of circle of radius "
         + circle3.radius + " is " + circle3.getArea());
   }
}

class SimpleCircle
{
   double radius;
   
   //make circle with radius of 1
   SimpleCircle()
   {
      radius=1;
   }
   //make circle with specific radius
   SimpleCircle(double newRadius)
   {
      radius=newRadius;
   }
   //return area of circle
   double getArea()
   {
      return radius * radius * Math.PI;
   }
   //return perimete of circle
   double getPerimeter()
   {
      return 2*radius*Math.PI;
   }
   //set a new radius for circle
   void setRadius(double newRadius)
   {
      radius=newRadius;
   }
}