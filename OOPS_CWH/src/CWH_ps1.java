
class students{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name= n;
    }
}

class cellphone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void calling(){
        System.out.println("calling...");
    }

}

class square{
    public int size(int l) {
        int a = l * l;
        int b = 4 * l;
        System.out.println("side of the square is " + l + "km");
        System.out.println("perimeter of the square is " + b + "sq.km");
        System.out.println("size of the square is " + a + "sq.km");

        return 0;
    }
}

class rectangle {
    public int size(int l, int b) {
        int a = l * b;
        int p = 2 * (l + b);
        System.out.println("length: " + l + "km and breadth: " + b + "km");
        System.out.println("perimeter of the square is " + p + "sq.km");
        System.out.println("area of the rectangle: " + a + "sq.km");

        return 0;
    }
}

class tommy{
    public void fight(){
        System.out.println("hitting...");
        System.out.println("running...");
        System.out.println("shooting...");

    }
}
public class CWH_ps1 {
    public static void main(String[] args) {
        students kajal=new students();
        kajal.setName("kajal");
        kajal.salary=230;
        System.out.println(kajal.getName());
        System.out.println(kajal.getSalary());

        cellphone c= new cellphone();
        c.calling();
        c.ringing();

        square a= new square();
        a.size(2);

        rectangle b=new rectangle();
        b.size(2,4);

        tommy t=new tommy();
        t.fight();
    }
}

