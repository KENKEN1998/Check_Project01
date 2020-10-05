import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ArrayList<Vehicle> arrVehicle = new ArrayList<>();
        do {
            System.out.println("================MENU===============");
            System.out.println("1.乗り物の座席予約");
            System.out.println("0.End");

            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Thank You");
                    break;
                case 1:
                    
                Vehicle ve = new Vehicle();
                    break;
            }
        } while (choice != 0);
    }
}
