import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static java.lang.Double.parseDouble;

public class DealershipFileManager {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static final String dealer = "dealer.csv";
 public static void getDealership() throws IOException {

         BufferedReader reader = new BufferedReader((new FileReader(dealer)));
         String line = "";
         while ((line = reader.readLine()) != null) {
             String[] parts = line.split("\\|");
             int vehicleId = Integer.parseInt(parts[0]);
             int year = Integer.parseInt(parts[1]);
             String make = parts[2];
             String model = parts[3];
             String vehicleType = parts[4];
             String vehicleColor = parts[5];
             int odometer = Integer.parseInt(parts[6]);
             double price = parseDouble(parts[7]);

             vehicles.add(new Vehicle(vehicleId,year,make,model,vehicleType,vehicleColor,odometer,price));


         }
         reader.close();
     }

    public void saveDealership(){

    }

}
