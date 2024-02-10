
//methods with the same name but in different classes with extending then while printing child will print
//only its own method by overriding

class A{
    public int kajal(){
        return 4;
    }
    public void meth2(){
        System.out.println("Im a method 2 of class A");
    }
}


class B extends A{
    @Override // won't matter even if we don't write it. shows the overriding if overriding does not occur it will throw error. use when u want to know its override

    public void meth2(){
        System.out.println("Im a method 2 of class B");
    }
    public void meth3(){
        System.out.println("Im a method 3 of class B");
    }
}


public class method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();

        B b=new B();
        b.meth2();
    }
}
