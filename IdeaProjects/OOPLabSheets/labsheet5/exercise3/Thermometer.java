package labsheet5.exercise3;

public class Thermometer
{
    private int currentTemperature;
    private int maximumTemperature;
    private int minimumTemperature;

    public Thermometer()
    {
        currentTemperature=0;
        maximumTemperature=Integer.MIN_VALUE;
        minimumTemperature=Integer.MAX_VALUE;
    }
    public Thermometer(int currentTemperature)
    {
        this.currentTemperature=currentTemperature;
        this.maximumTemperature=currentTemperature;
        this.minimumTemperature=currentTemperature;
    }
    public int getCurrentTemperature()
    {
        return currentTemperature;
    }
    public int getMaximumTemperature()
    {
        return maximumTemperature;
    }
    public int getMinimumTemperature()
    {
        return minimumTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setMaximumTemperature(int maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public void setMinimumTemperature(int minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }
    public int setTemperature(){
        //private int updateMaxMinTemp(){
            //return
        //}
        return currentTemperature;
    }

    public String toString() {
        return "Thermometer\n" +
                "currentTemperature=" + getCurrentTemperature()+"\n"+
                "maximumTemperature=" + getMaximumTemperature() + "\n"+
                "minimumTemperature=" + getMinimumTemperature() + "\n";
    }
}
