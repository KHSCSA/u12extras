class Widget{

    private int x;

    public Widget(int num){
        this.x = num;
    }

    public void mystery(){
        System.out.println("the object called this method");
    }

    public String toString(){
        return "the object has this property: " + this.x;
    }
}

class JavaExample{
    public static void main(String[] args){
        Widget thing = new Widget(42);
        thing.mystery();
        System.out.println(thing);
    }
}

