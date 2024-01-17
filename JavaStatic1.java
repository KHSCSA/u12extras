public class JavaStatic1 {
    public static void main(String[] args){
        mystery1();
        JavaStatic1.mystery1();  // class name is optional

        String ans = mystery4(42);
        System.out.println(ans);
    }

    public static void mystery1(){
        System.out.println("stuff");
    }

    public static String mystery2(){
        return "I'm giving you back " + 42;
    }


    public static void mystery3(int num){
        System.out.println("You sent " + num);
    }

    public static String mystery4(int num){
        return "I'm giving you back " + num;
    }

}

