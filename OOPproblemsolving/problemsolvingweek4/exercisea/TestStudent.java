package problemsolvingweek4.exercisea;

//TestStudent.java
/*A driver class to test out the functionality of the Student class*/

public class TestStudent {
    public static void main (String[] args) {
        Student s1 = new Student("Tim", "Computing", new String[]{"Maths","Java","Web Dev","Networking Basics"});
        Student s2 = new Student("Ita", "Social Care", new String[]{"Intro to Social Care", "Caring for the Elderly","Psychology"} );
        Student s3 = new Student("Joe", "Physics", new String[]{"Relativity","Mechanics","Hydrodynamics","Statics","Quantum Mechanics"});

        Student allStudents[] = new Student[3];

        allStudents[0] = s1;
        allStudents[1] = s2;
        allStudents[2] = s3;

        System.out.println("Calling static method getCount() to determine the " +
                           "\nnumber of students in the college");

        System.out.println("\nTotal students in college: " + Student.getCount());

        System.out.println("\n\nDisplaying the state of the " + Student.getCount() + " Student objects at this point\n");

        for(int i=0;i<3;i++){
            System.out.println("Student " + (i+1) + "\n\n" + allStudents[i] + "\n\n");
        }

        Student.setCollege("Munster Technological University");

        System.out.println("Calling static method setCollege() to alter the name of the " +
                           "\ncollege to \"Munster Technological University\"");

        System.out.println("\n\nDisplaying the state of the " + Student.getCount() + " Student objects at this point\n\n");

        for(int i=0;i<3;i++){
            System.out.println("Student " + (i+1) + "\n\n" + allStudents[i] + "\n\n");
        }
    }
}
