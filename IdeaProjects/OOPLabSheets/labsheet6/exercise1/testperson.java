package labsheet6.exercise1;


import javax.swing.*;

public class testperson
{
    public static void main(String[] args)
    {
        String text,firstName,lastName;

        text = "Calling the Person() constructor .....";
        person person1 = new person();
        text += "\nValue of first Person object is: " + person1;

        text += "\n\nCalling the Person(String,String) constructor after getting user-supplied values .....";

        firstName = JOptionPane.showInputDialog("Please enter the first name of the second person");
        lastName = JOptionPane.showInputDialog("Please enter the last name of the second person");

        person person2 = new person(firstName, lastName);
        text += "\nValue of second person object is: " + person2;

        JOptionPane.showMessageDialog(null,"*****Person Class Tester*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}