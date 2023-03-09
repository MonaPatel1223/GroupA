package demo_obj;

public class Lab
{
    double Scanner_version;
    String Computer;
    int Tables;
    char Medicine;
    double result;


    public static void main(String[] args) {
        // using static mathod through call object
        Lab obj1=new Lab();
        obj1.Scanner_version=2.3;
        obj1.Computer="Microsoft Office";
        obj1.Tables=20;
        obj1.Medicine='P';
        obj1.result=20.0;

        System.out.println("Scanner version:"+obj1.Scanner_version);
        System.out.println("Computer Name:"+obj1.Computer);
        System.out.println("Number of Tables:"+obj1.Tables);
        System.out.println("Name of Medicine:"+obj1.Medicine);
        System.out.println("Actual Result:"+obj1.result);




    }
}
