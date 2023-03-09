package object;

public class Demo_NHS {
    // declare a variable
    int staff;
    String Hospital_Name;
    double hour;
    char Departments;

    public static void main(String[] args) {
        // crete an object
        Demo_NHS N=new Demo_NHS();
        N.staff=100;
        N.Hospital_Name="Northwick Park Hospital";
        N.hour=30.5;
        N.Departments='A';

        System.out.println("Total Staff:"+N.staff);
        System.out.println("Hospital_Name:"+N.Hospital_Name);
        System.out.println("Total Hour:"+N.hour);
        System.out.println("Departments:"+N.staff);

    }
}
