import java.util.Scanner;

public class SolarEnergyCalculator {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning energy generation (in kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generation (in kWh): ");
        double evening = scanner.nextDouble();

        double total = calculateTotalEnergy(morning, evening);

        System.out.println("Total energy generated: " + total + " kWh"); 
    }
}