import java.util.Scanner;
public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Water Consumption in Liters: ");
        double consumption = sc.nextDouble();
        
        if (consumption <=500) {
            System.out.println("The Water Bill is: 100");
        }
        else {
            System.out.println("The Water Bill is: 200");
        }
    }
}