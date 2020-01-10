
//Private
class A {

    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }

}


public class Simple {

    public static void main(String args[]) {

        A obj = new A();

        System.out.println(obj.data);//Compile Time Error

        obj.msg();//Compile Time Error

    }

}


//Default


package pack;

class A {

    void msg() {
        System.out.println("Hello");
    }

}

//save by B.java

package mypack;

        import pack.*;

class B {

    public static void main(String args[]) {

        A obj = new A();//Compile Time Error

        obj.msg();//Compile Time Error

    }


}

//Protected

//save by A.java

package pack;

public class A{

    protected void msg(){System.out.println("Hello");}

}


//save by B.java

package mypack;

        import pack.*;



class B extends A{

    public static void main(String args[]){

        B obj = new B();

        obj.msg();

    }

}



//save by B.java

package mypack;

        import pack.*;



class B extends A{

    public static void main(String args[]){

        B obj = new B();

        obj.msg();

    }

}



//save by B.java

package mypack;

        import pack.*;



class B extends A{

    public static void main(String args[]){

        B obj = new B();

        obj.msg();

    }
}


//Public



//save by A.java



package pack;

public class A{

    public void msg(){System.out.println("Hello");}

}


//save by B.java



package mypack;

        import pack.*;



class B{

    public static void main(String args[]){

        A obj = new A();

        obj.msg();

    }

}



