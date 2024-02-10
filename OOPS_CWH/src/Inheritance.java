
    //used to borrow properties and methods from existing classes
    class base{
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void printme(){
            System.out.println("im a constructor");
        }
    }

    class derived extends base{
        //things in base are now available in derived
        //all the changes later done in base can also be done in derived directly
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class Inheritance {
    public static void main(String[] args) {

        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        derived c = new derived();
        c.setX(43);
        System.out.println(c.getX());

        derived d = new derived();
        c.setY(53);
        System.out.println(c.getY());

    }
}
