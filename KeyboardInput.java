import java.util.Scanner;

class KeyboardInput {
    public static void main(String[] args) { 
        // create a scanner object
        Scanner s = new Scanner(System.in);

        // precede with a System.out prompt
        // getting String input
        System.out.print("type anything: ");
        String stringVar = s.nextLine();

        // getting integer input, v1
        System.out.print("the safe way to get integer input: ");
        String stringVar2 = s.nextLine();
        int numVar = Integer.parseInt(stringVar2);

        // getting integer input, (condensed v1)
        System.out.print("the condensed way to get integer input: ");
        int numVar2 = Integer.parseInt(s.nextLine());
    }
}