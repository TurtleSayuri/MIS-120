//Melissa deCastro
//Exam #4
//May 4, 2017

public class TestEmployeeClass_deCastro
{
   public static void main(String[] args)
   {
      Employee employee1 = new Employee(1234, "123456789",
         "Joe", "Smith", 'm', "123 Elm Street", "Consultant"); 
      System.out.println(employee1);
      employee1.setEmpType("Contractor");
      employee1.addYrsExperience(2);
      System.out.println(employee1);
      
      Employee employee2 = new Employee(2345, "111111111",
         "Mary", "Jones", 'f', "123 Oak Street", "Consultant");
      System.out.println(employee2);
      employee2.setEmpType("Manager");
      System.out.println(employee2);
      employee2.addYrsExperience(6);
      System.out.println(employee2);
      
      System.out.println();
      
      if(employee1.getYrsExperience()>employee2.getYrsExperience())
      {
         System.out.println(employee1.getfName() + " " + employee1.getlName());
      }
      else
      {
         System.out.println(employee2.getfName() + " " + employee2.getlName());
      
      }
      
   }
}