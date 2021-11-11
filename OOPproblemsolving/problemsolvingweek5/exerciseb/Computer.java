package problemsolvingweek5.exerciseb;

//Computer.java
/*An instantiable Computer class that contains a nested Case object*/

public class Computer {

    private Case computerCase;
    private String monitor;
    private String motherboard;

    public Computer(Case computerCase, String monitor, String motherboard) {
        setComputerCase(computerCase);
        setMonitor(monitor);
        setMotherboard(motherboard);
    }

    public Case getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(Case computerCase) {
        this.computerCase = computerCase;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }


    public String toString(){
        return "Case Details:  " + getComputerCase() + "\nMonitor: " + getMonitor() + "\nMotherboard: " + getMotherboard();
    }
}
