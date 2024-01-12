public class JavaStatic2 {
    public static void main(String[] args){
        Stuff.mystery1();  // class name is required

        String ans = Stuff.mystery4(42);
        System.out.println(ans);
    }
}

class Stuff{
    public static void mystery1(){
        System.out.println("stuff");
    }

    public static String mystery4(int num){
        return "You sent " + num;
    }
}

