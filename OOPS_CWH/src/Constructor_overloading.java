

class emp{
    int salary;
    public emp(){
        salary=10000;
    }
    public emp(int sal){
      salary=sal;
    }

}

public class Constructor_overloading {
    public static void main(String[] args) {
        emp jay=new emp();
        System.out.println(jay.salary);
    }
}

