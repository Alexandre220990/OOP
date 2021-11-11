package problemsolvingweek5.exercisea;

//TestClass.java
/*A driver class to test out the functionality of the Class and Time classes*/

public class TestClass {
    public static void main (String[] args) {
        Class yogaClass = new Class("Yoga for Beginners","Community Centre, Ballyheigue",23,
                                    new Time(19,30,0),new Time(20,45,0));

        Class zumbaClass = new Class("Intermediate Zumba","Caherciveen S.S. Sports Hall",18,
                                    new Time(18,45,0),new Time(19,30,0));

        Class javaClass = new Class("Object Oriented Programming","S306",22,
                                    new Time(9,0,0), new Time(11,0,0));

        Class allClasses[] = new Class[3];

        allClasses[0] = yogaClass;
        allClasses[1] = zumbaClass;
        allClasses[2] = javaClass;

        System.out.println("\n\nDisplaying the state of the " + allClasses.length + " Class objects at this point\n");

        for(int i=0;i<3;i++){
            System.out.println("Class " + (i+1) + "\n\n" + allClasses[i] + "\n\n");
        }

        //The next section is to prove that the validation code in the Time class mutators is working

        System.out.println("\nTrying to change the start and finish times of the Object Oriented Programming class to dodgy values of 11:60:-12 and -2:58:61 respectively\n");

        javaClass.setStartTime(new Time(11,60,-12));
        javaClass.setFinishTime(new Time(-2,58,61));

        System.out.println("\nThe state of the Object Oriented Programming Class object is now \n\n" + javaClass);

        //The next section is to prove that we have written the setStartTime() method correctly, so that the nested Time object associated with a
        //Class object cannot be tampered with from outside the class, through a Time object reference

        Time yogaStartTime = new Time(19,45,0);

        System.out.println("\n\nTrying to change the start time of the Yoga class to 19:45:00 using a referenced Time object called yogaStartTime");

        yogaClass.setStartTime(yogaStartTime);

        System.out.println("\nThe state of Yoga Class object is now \n\n" + yogaClass);

        System.out.println("\n\nNow changing the time of the referenced yogaStartTime object to 18:50:00");

        yogaStartTime.setHour(18);
        yogaStartTime.setMinute(50);

        System.out.println("\nThe state of yogaStartTime object is now " + yogaStartTime);
        System.out.println("\nThe state of Yoga Class object is now \n\n" + yogaClass);

        //The next section is to prove that we have written the getStartTime() method correctly, so that the nested Time object associated with a
        //Class object cannot be tampered with from outside the class, through a Time object reference

        System.out.println("\n\nNow calling getFinishTime() to return the finish time of the zumba Class object - this is being stored in a Time object called zumbaFinishTime");

        Time zumbaFinishTime = zumbaClass.getFinishTime();

        System.out.println("\n\nNow trying to change the zumba class finish time from 19:30:00 to 19:50:00 by altering the object linked to the zumbaFinishTime reference");

        zumbaFinishTime.setHour(19);
        zumbaFinishTime.setMinute(50);

        System.out.println("\nThe state of zumbaFinishTime object is now " + zumbaFinishTime);
        System.out.println("\nThe state of Zumba Class object is now \n\n" + zumbaClass);
    }
}
