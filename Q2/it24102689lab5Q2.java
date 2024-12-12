import java.util.Scanner;

public class it24102689lab5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = sc.nextInt();
        
        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            System.out.println("Prize is: " + prize);
        }
    }
}
