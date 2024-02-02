public class StringTester{
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello";

        System.out.print("hello == world ");
        System.out.println(s1 == s2);
        System.out.println("hello.equals(world) " + s1.equals(s2));
        
        System.out.print("\nhello == hello ");
        System.out.println(s1==s3);
        System.out.println("hello.equals(hello) " + s1.equals(s3));


        String s4 = "oddly";
        String s5 = "badly";
        System.out.print("\ntaken from a string: ly == ly ");
        System.out.println(s4.substring(s4.length()-2)==s5.substring(s5.length()-2));
        System.out.print("ly.equals(ly) ");
        System.out.println(s4.substring(s4.length()-2).equals(s5.substring(s5.length()-2)));




    }
}