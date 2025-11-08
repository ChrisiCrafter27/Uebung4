package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 1;
        double price = 0;

        // Schöner:
        //price = switch(zone) {
        //    case 1 -> 2.00;
        //    case 2 -> 2.35;
        //    case 3, 4 -> 2.85;
        //    case 5 -> 3.55;
        //    default -> 4.00;
        //};

        // Wie in der Vorlesung:
        price = 0;
        switch(zone)  {
            case 5:
                price += 0.70;
            case 4, 3:
                price += 0.50;
            case 2:
                price += 0.35;
            case 1:
                price += 2.00;
                break;
            default:
                price = 4.00;
        }

        //System.out.println("Zone: " + zone);
        //System.out.println("Preis: " + price);
    }
}
