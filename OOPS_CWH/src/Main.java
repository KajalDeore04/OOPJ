
class Employee{
    //adjectives
    int id;
    String empName;

    //method=verb
    public void printdetail(){
        System.out.println("my name is " + empName);
        System.out.println("my id: " + id);
    }
}

public class Main{
    public static void main(String[] args) {

        //setting attributes for kajal
        Employee kajal = new Employee();        //instanciating a new employee object
        kajal.id = 20;
        kajal.empName = "kajal deore";

        //setting attributes for kajal
        Employee jey = new Employee();         //instanciating a new employee object
        jey.id = 40;
        jey.empName = "jey";

        //System.out.println(kajal.id);
        kajal.printdetail();
        jey.printdetail();
    }
}