import java.util.Scanner;
public class HouseholdBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter HouseHold Members:");
        int members = sc.nextInt();
        System.out.println("Enter Water Usage:");
        double water = sc.nextDouble();
        System.out.println("Enter House Number:");
        int housenumber = sc.nextInt();
        System.out.println("Enter Water Usage Status:");
        char waterusage = sc.next().charAt(0);

        System.out.println("Household Members: " + members);
        System.out.println("Water Usage: " + water);
        System.out.println("House Number: " + housenumber);
        System.out.println("Water Usage Status: " + waterusage);
    }
}