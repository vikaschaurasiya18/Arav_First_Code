public class day3 {
    public static void main(String[] args) {
        int total_energy = 100;
        int distance_to_tower = 20;
        int cost_per_km = 2;
        int travel_cost = distance_to_tower * cost_per_km;
        int remaining_energy = total_energy - travel_cost;
        boolean enough_energy = remaining_energy >= 50;
        System.out.println("Total Energy= " + total_energy);
        System.out.println("Travel Cost " + travel_cost);
        int energy_required = 50;
        System.out.println("Energy Required to Pass the bridge: " + energy_required);
        System.out.println("Remaining Energy " + remaining_energy);
        System.out.println("Can we pass the gate with the remaining energy: " + enough_energy);
        if (remaining_energy >= 50) {
            System.out.println("Gate Opened");
        }
        System.out.println(10 > 5);
        System.out.println(10 < 5);
        System.out.println(10 == 15);
        System.out.println(5 >= 5);
        System.out.println(10 != 5);
        System.out.println(10 == 10);
        System.out.println(10 & 3);
    }
}