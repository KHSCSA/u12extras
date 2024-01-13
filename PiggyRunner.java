public class PiggyRunner{
    public static void main (String [] args){
        Piggy pocket = new Piggy(3, 0, 1, 2);

        System.out.println("In my pocket I have: ");
        System.out.println(pocket.getQuarters() + " quarters, " + pocket.getDimes() + " dimes, " + pocket.getNickels() + " nickels, and " + pocket.getPennies() + " pennies");
        System.out.println("total money in pocket: $" + pocket.calcTotal());

        System.out.println("\nnow setting a different number of quarters");
        pocket.setQuarters(3);
        System.out.println("new total in pocket: $" + pocket.calcTotal());

        Piggy jar = new Piggy(15, 8, 10, 20);
        System.out.println("\nin a jar I have: ");
        System.out.println(jar.getQuarters() + " quarters, " + jar.getDimes() + " dimes, " + jar.getNickels() + " nickels, and " + jar.getPennies() + " pennies");
        System.out.println("total money in jar: $" + jar.calcTotal());

    } // close main
} // close Main


class Piggy{
    private int pennies, nickels, dimes, quarters;
    private double total;

    //params are pennies, nickels, dimes, quarters
    public Piggy(int param1, int param2, int param3, int param4){
        this.pennies = param1;
        this.nickels = param2;
        this.dimes = param3;
        this.quarters = param4;
        this.total = calcTotal();
    }

    //we should write 'getters' for each attribute
    public int getQuarters(){ return this.quarters; }
    public int getDimes() { return this.dimes; }
    public int getNickels() { return this.nickels; }
    public int getPennies() { return this.pennies; }

    //we should write 'setters' for each attribute
    public void setQuarters(int param){ this.quarters = param; }
    public void setDimes(int param){ this.dimes = param; }
    public void setNickels(int param){ this.nickels = param; }
    public void setPennies(int param){ this.pennies = param; }

    public double calcTotal(){
        this.total = 0.01*pennies + 0.05* nickels + 0.1*dimes + 0.25*quarters;
        return this.total;
    }
}

