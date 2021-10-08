package labsheet5.exercise1;

import labsheet3.exercise1.Computer;

import javax.swing.*;
public class TestBook {
    public static void main(String[] args) {
        String output = "";

        //Computer c1 = new Computer();

        //System.out.println(c1.getManufacturer());

        labsheet4.exercise3.Book b1 = new labsheet4.exercise3.Book();

        output += "Calling the no-argument Book constructor. " +
                "The first Book object details are: \n\n" + b1.toString();

        labsheet4.exercise3.Book b2 = new labsheet4.exercise3.Book("The Davinci Code",19.99,"3452617232",348);

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}