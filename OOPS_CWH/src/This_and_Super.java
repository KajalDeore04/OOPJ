
  class ekClass{
      int a;

      public int getA() {
          return a;
      }

      ekClass(int v){
        this.a=v;    //will run without this keyword
      }

      public int returnOne(){
        return 1;
      }
  }

  class doClass extends ekClass{

      doClass(int c){
        super(c);     //super is just used to show that we have to call this constructor
        System.out.println("Im a constructor");   //this is default constructor
      }
  }



  public class This_and_Super {
    public static void main(String[] args) {
        ekClass e= new ekClass(5);
        System.out.println(e.getA());
        doClass d=new doClass(4);
    }
  }
