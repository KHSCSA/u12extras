public class JavaStatic1 {
    public static void main(String[] args){
        mystery();
        JavaStatic1.mystery();  // class name is optional

        String ans = mystery2(42);
        System.out.println(ans);
    }

    public static void mystery(){
        System.out.println("stuff");
    }

    public static String mystery2(int num){
        return "You sent " + num;
    }

}

