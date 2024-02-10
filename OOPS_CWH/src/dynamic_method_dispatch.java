
 class one{
    public void name(){
        System.out.println("my name is java");
    }
     public void greet(){
         System.out.println("Morning People");
     }
 }

 class two extends one{
    public void name(){
        System.out.println("my name is java2");
    }
     public void swagat(){
         System.out.println("Swagat");
     }
 }




public class dynamic_method_dispatch {
    public static void main(String[] args) {
        //one obj=new one();
        //obj.name();

        //two obj2=new two();

        one obj=new two();    //it should be parents new child
        //two obj=new one();   not allowed....

        obj.greet();
        obj.name();           //runs the second one coz obj of second

    }
}
