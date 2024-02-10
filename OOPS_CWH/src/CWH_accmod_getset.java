
class myEmployee{
    private int id;
    private String name;

    public void setInfo(String goodname,int id1){
        name=goodname;
        id=id1;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}


public class CWH_accmod_getset {
    public static void main(String[] args) {
        myEmployee kajal=new myEmployee();

        //kajal.id=6;             this run when instance variable is default or public
        //kajal.name="kajal";

        kajal.setInfo("KAJAL",24);
        System.out.println(kajal.getId());
        System.out.println(kajal.getName());
    }
}
