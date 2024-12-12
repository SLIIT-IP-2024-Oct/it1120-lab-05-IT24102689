import java.util.Scanner;

public class it24102689lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Start date and end date cannot be less than 1 or greater than 31");
            return;
        }
        
        if (startDate >= endDate) {
            System.out.println("Start date should be less than End Date");
            return;
        }
        
        int numberOfDaysReserved = endDate - startDate;
        int discountRate = 0;
        
        if (numberOfDaysReserved > 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }
        
        int totalAmount = ROOM_CHARGE_PER_DAY * numberOfDaysReserved;
        totalAmount -= totalAmount * discountRate / 100;
        
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
