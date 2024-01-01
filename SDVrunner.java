// even though the class is in a different file
// Java does not require an import statement

class SDVrunner {
    public static void main(String[] args) {
        // first, look in the SDV class to see how to create an SDV object
        // this is called 'constructing an object from the SDV class'
        // also called 'instantiating and SDV object'
        SDV mySDV = new SDV("Grace");

        // mySDV is a variable. More specifically it is an object.
        // even more specifically it is an 'instance of the SDV class'
        // we can create more if we want to!


        // the object has access to its methods / functions
        mySDV.sayHello();
        mySDV.moveForward(10);
        mySDV.moveForward(10);


        // look in the SDV class to see what properties and functions/methods an SDV object has access to
        // the object can access (or change) its properties
        //System.out.println(mySDV.hasVision); // NOPE!!
        // we can write a 'getter' method
        System.out.println(mySDV.getVision());


        // let's print the object
        System.out.println(mySDV);


        // STOP and write code here
        // construct another 'SDV' object
        // use that object to call some functions
        // access some of the object's properties

    }
}