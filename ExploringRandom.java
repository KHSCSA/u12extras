
public class ExploringRandom{
    public static void main(String[] args){

        // we'll get random numbers from -5 to 5
        // list with 11 items, initialized to zero
        // indices are 0 to 11
        int[] nums = new int[11];
        

        System.out.println("the correct way to make random ints from 100 to 110");
        for(int i = 0; i<100000; i++){
            int temp = (int)(Math.random()*11) - 5;
            nums[temp+5]++; // add 5 to get proper index
        }
        for(int i = 0; i<=10; i++){
            System.out.println((i-5) + " " + nums[i]);
        }

        
        // reset the list
        for(int i = 0; i<=10; i++) nums[i]=0;

        System.out.println("\nthe *incorrect* way to make random ints from 100 to 110");
        for(int i = 0; i<100000; i++){
            int temp = (int)(Math.random()*11 - 5);
            nums[temp+5]++; // add 5 to get proper index
        }
        
        for(int i = 0; i<=10; i++){
            System.out.println((i-5) + " " + nums[i]);
        }

    } // close main
} // close class