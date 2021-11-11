package labsheet9.exercise1;


public class TestPolymorphism {
      public static void main(String[] args)
         {
             Employee[] employees = new Employee[3]; //creating an array of Employee objects

             Boss b1 = new Boss("Joe","Smith",750.50);

             HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);

             employees[0]=b1; //recall a Boss "is a" Employee so this assignment is allowed

             employees[1]=hw1; //recall that an HourlyWorker "is a" Employee so this is okay too

             SelfEmployedWorker selfEmp = new SelfEmployedWorker("Richard","Branson");

             employees[2]=selfEmp; //ditto for a SelfEmployedWorker

             //will now use the Employee reference objects within the array to display the correct information via polymorphism

             //note the generic nature of the code here

             for(int i=0;i<employees.length;i++)
                System.out.println(employees[i].toString() + " and the earnings were €" + String.format("%.2f",employees[i].earnings()) + "\n");
         }
}