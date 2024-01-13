class CardsRunner {
    public static void main(String[] args) {
        // the keyword 'new' calls the constructor
        Card first = new Card("Diamonds", "Ace", 11);
        System.out.println("\nUsing a getter method: " + first.getSuit());
    
        // calling the toString method
        System.out.println("\nprinting oneCard: ");
        System.out.println(first);
        System.out.println(first.toString());
    
        // is this card 'equal' to the other??
        // it is initialized with the same values
        Card another = new Card("Diamonds", "Ace", 11);
        System.out.print("\nis first == another? ");
        System.out.println(first == another);

        System.out.print("are they equal? ");
        System.out.println(first.equals(another));   
        
    } // close main
} // close Main
  

class Card{
    // attributes of the object
    private String suit;
    private String rank;
    private int value;

    // the constructor is a special method
    public Card(String s, String r, int v){
        this.suit = s;
        this.rank = r;
        this.value = v;
    } // close constructor

    // accessor methods (or 'getters')
    public String getSuit(){ return this.suit; } 
    public String getRank(){ return this.rank; }
    public int getValue(){ return this.value;  }

    // this method is called when we print an object
    public String toString(){
        String temp = "Here is the card info: \n";
        temp += this.suit + " " + this.rank + " " + this.value + "\n";
        return temp;
    }

    // are two objects of this type equal?
    public boolean equals(Card p){
        if(this.suit.equals(p.suit))
            if(this.rank.equals(p.rank))
                if(this.value == p.value)
                    return true;
        return false;
    }
} // close class


