public class CatRunner {
    public static void main(String[] args){
        Cat firstCat = new Cat("hairless", "spotted");
        System.out.println(firstCat + "\n");

        HouseCat myCat = new HouseCat("January", "tuxedo");
        myCat.play();
        System.out.println(myCat + "\n");

        Tiger atTheZoo = new Tiger();
        atTheZoo.play();
        System.out.println(atTheZoo); // it will first look in the subclass
    }
}

class Cat{
    String sound;
    private int numLegs = 4;
    private Skin furCoat;

    public Cat(String tex, String col){
        this.furCoat = new Skin(tex, col);
    }
    public String toString(){
        String ans = "Printing a cat...";
        ans += "num legs is " + this.numLegs;
        ans += "\n" + this.furCoat;
        return ans;
    }
}

class HouseCat extends Cat{
    private String name;
    public HouseCat(String n, String col){
        super("Fluffy", col);
        this.name = n;
        this.sound = "meow"; // sound is declared in the superclass
    }
    public String toString(){
        String ans = "Printing a HouseCat...";
        ans += "name is " + this.name + "\n" + super.toString();
        return ans;
    }
    public void play(){
        System.out.println("A housecat likes lasers and says " + this.sound);
    }
}

class Tiger extends Cat{
    public Tiger(){
        super("wiry", "striped");
        this.sound = "roar";
    }
    public void play(){
        System.out.println("A tiger likes to attack and says " + this.sound);
    }
}

class Skin{
    String color, texture;

    public Skin(String tex, String col){
        this.color = col;
        this.texture = tex;
    }
    public String toString(){
        return "this fur skin is " + this.texture + " and " + this.color;
    }
}