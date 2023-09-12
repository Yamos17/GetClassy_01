import java.util.Calendar;

public class main {
    public static void main(String[] args) {

        Product lightsaber = new Product("129482", "Light Saber", "Sword made from pure energy", 10000.0);

        System.out.println(lightsaber.getfName());

        System.out.println(lightsaber);

        System.out.println(lightsaber.toCSV());

        System.out.println(lightsaber.getName());

        System.out.println(lightsaber.getDescription());

        System.out.println(lightsaber.getCost());
    }
}
