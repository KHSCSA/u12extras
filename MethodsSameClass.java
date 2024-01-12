public class MethodsSameClass{
    public static void main(String[] args){

        mystery1(); // class name is optional
        String ans = MethodsSameClass.mystery2();
        System.out.println(ans);

    } // close main()


    public static void mystery1(){
        System.out.println("stuff");
    }

    public static String mystery2(){
        return "I'm giving you back " + 42;
    }
} // close Class

