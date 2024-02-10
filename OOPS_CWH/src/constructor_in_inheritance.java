
   class base1 {

       base1() {
           System.out.println("Im a constructor");
       }

       base1(int x) {
           System.out.println("Im an overloaded constructor with value of x as: "+x);
       }

   }

   class derived1 extends base1 {

       derived1() {
           super(0);      //  w/o  this dervied won't print overloaded constructor but with super it will put x as 0 and print all
           System.out.println("Im a constructor 2");
       }

       derived1(int x, int y){
           super(x);
           System.out.println("im an overloaded constructor of derived with value of x as: "+x);
       }
   }

   class childofDerived extends derived1{

       childofDerived(){
           System.out.println("im a child of derived constructor");
       }

       childofDerived(int x, int y, int z){
           super(x,y);
           System.out.println("im an overloaded constructor of child derived with value of z as: "+z);
       }
   }



public class constructor_in_inheritance {
    public static void main(String[] args) {
       // base1 b=new base1();
       // derived1 d= new derived1(14,9);    //sout will print twice
        // childofDerived cd= new childofDerived();
        childofDerived cd= new childofDerived(2,5,4);

    }
}
