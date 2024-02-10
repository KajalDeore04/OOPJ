
    class myMainEmployee{
        private int id;
        private String name;

        public myMainEmployee(){
            id=45;
            name="your name here";
        }

        public myMainEmployee(String myname){
            id=45;
            name=myname;
        }

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
    public class constructors {
    public static void main(String[] args) {
        myMainEmployee kajal= new myMainEmployee("kaju");
       // kajal.setInfo("kajal",2);
        System.out.println(kajal.getId());
        System.out.println(kajal.getName());
    }
}
