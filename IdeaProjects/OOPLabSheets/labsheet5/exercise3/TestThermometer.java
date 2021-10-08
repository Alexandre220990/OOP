package labsheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        String output = "";

        Thermometer t1 = new Thermometer();

        t1.setCurrentTemperature(35);

        output+="Calling the single-argument constructor...setting the temperature of first thermometr to 35C\n\n"+
                        t1.toString();

        //Thermometer t2 = new Thermometer();

        //Thermometer t3 = new Thermometer();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
