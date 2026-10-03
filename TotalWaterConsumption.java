import java.util.Scanner;
public class TotalWaterConsumption {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Morning Water Usage:");
        int morningUsage = sc.nextInt();
        System.out.println("Enter Evening Water Usage:");
        int eveningUsage = sc.nextInt();
        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Water Consumption: " + totalUsage + " Liters");
    }
}