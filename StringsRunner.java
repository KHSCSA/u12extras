class StringsRunner {
    public static void main(String[] args) {
        // Strings are objects in Java
        // we can construct Strings different ways
        String s1 = "Hello"; // the easy way
        String s2 = new String("Hi");

        // concatenation, our old friend
        // two ways: using '+' or .concat()
        String s3 = s1 + s2;
        System.out.println(s3);

        String s4 = s1.concat(s2);
        System.out.println(s4);

        // automatic type conversion!
        String s5 = s1 + 42;
        System.out.println(s5);

        System.out.println("this is " + 13);

    }
}