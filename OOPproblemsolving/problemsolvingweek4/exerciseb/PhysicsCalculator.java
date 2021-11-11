package problemsolvingweek4.exerciseb;

//Student.java
/*An non-instantiable utility class that contains some static constant attributes along with
* some static methods that allow the user to perform some physics calculations*/

public class PhysicsCalculator {
    public static final int SPEED_OF_LIGHT = 299792458;
    public static final double PLANCK_CONSTANT = 6.62607004E-34;
    public static final double PERMITTIVITY_OF_VACUUM = 8.8542E-12;

    private PhysicsCalculator(){
        //does nothing but it stops the class from being instantiated
    }

    public static double energyFromMass(double mass){
        return mass*SPEED_OF_LIGHT*SPEED_OF_LIGHT;
    }

    public static double energyFromFrequency(double frequency){
        return PLANCK_CONSTANT*frequency;
    }

    public static double coulombForce(double charge1, double charge2, double distance){
        return charge1*charge2/(4*Math.PI*PERMITTIVITY_OF_VACUUM*distance*distance);
    }
}
