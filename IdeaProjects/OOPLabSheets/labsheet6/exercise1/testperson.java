package labsheet6.exercise1;

import javax.swing.*;

public class testperson {
    public static void main(String[] args) {
        String output="",firstName,lastName;

        person p1 = new person();

        output+="calling the person constructor 1......" + p1.toString();

        firstName=JOptionPane.showInputDialog("Enter First Name: ");
        lastName=JOptionPane.showInputDialog("Enter Last Name: ");

        person p2 = new person(firstName,lastName);

        output+="\ncalling the person constructor 2......" + p2;



        JOptionPane.showMessageDialog(null,output,"input",JOptionPane.INFORMATION_MESSAGE);
    }
}
