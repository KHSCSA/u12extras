public class JavaStatic2 {
    public static void main(String[] args){
        Stuff.mystery();  // class name is required

        String ans = Stuff.mystery2(42);
        System.out.println(ans);
    }
}

class Stuff{
    public static void mystery(){
        System.out.println("stuff");
    }

    public static String mystery2(int num){
        return "You sent " + num;
    }
}

