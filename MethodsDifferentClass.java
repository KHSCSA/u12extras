public class MethodsDifferentClass{
    public static void main(String[] args){

        MyClass.mystery1(); // class name is **required**
        String ans = MyClass.mystery2(); 
        System.out.println(ans); 

    } // close main()
} // close Class

class MyClass{
    public static void mystery1(){
        System.out.println("stuff");
    }

    public static String mystery2(){
        return "I'm giving you back " + 42;
    }
} // close Class

