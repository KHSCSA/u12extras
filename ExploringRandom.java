
public class ExploringRandom{
    public static void main(String[] args){

        // we'll get random numbers from -10 to 10
        // list with 21 items, initialized to zero
        // indices are 0 to 20
        int[] nums = new int[21];
        

        System.out.println("the correct way to make random ints from 100 to 110");
        for(int i = 0; i<100000; i++){
            int temp = (int)(Math.random()*21) - 10;
            nums[temp+10]++; // subtract 10 to get proper index
        }
        for(int i = 0; i<=20; i++){
            System.out.println((i-10) + " " + nums[i]);
        }

        
        // reset the list
        for(int i = 0; i<=20; i++) nums[i]=0;

        System.out.println("\nthe *incorrect* way to make random ints from 100 to 110");
        for(int i = 0; i<100000; i++){
            int temp = (int)(Math.random()*21 - 10);
            nums[temp+10]++; // subtract 10 to get proper index
        }
        
        for(int i = 0; i<=20; i++){
            System.out.println((i-10) + " " + nums[i]);
        }

    } // close main
} // close class