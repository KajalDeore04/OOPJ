    class rectanglee {
          private int length;
          private int breadth;

        public rectanglee() {
            this.length = 4;
            this.breadth = 5;
        }

        public rectanglee(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }

    class cylinder {
        private int radius;
        private int height;

        public cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
        public double surfaceArea(){
            return 2* 3.142* radius * radius + 2*3.142*radius*height;
        }
        public double volume(){
            return 3.142* radius * radius *height;
        }

    }
    public class ps9 {
    public static void main(String[] args) {
        /*cylinder c= new cylinder();
        c.setHeight(12);
        int h=c.getHeight();
        c.setRadius(9);
        int r=c.getRadius();
        System.out.println(h);
        System.out.println(r);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

         */

        //problem3

        /*cylinder c=new cylinder(9,12);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
         */

        rectanglee r=new rectanglee();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
