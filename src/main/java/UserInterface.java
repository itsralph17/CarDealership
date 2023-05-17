import java.io.IOException;

public class UserInterface {
    Dealership dealership = new Dealership("Ralph", "180 Highbride Rd", "808-555-6567");

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    private void init() throws IOException {
    DealershipFileManager.getDealership();
    }




    public void display() throws IOException {
        init();

    }

    public double processGetByPriceRequest() {
        return 0;
    }

    public String processGetByMakeModel() {
        return null;
    }
    public int processGetByYearRequest() {
        return 0;
    }
    public String processGetByColorRequest() {
        return null;
    }
    public String processGetByMileageRequest() {
        return null;
    }
    public String processGetByVehiclesRequest() {
        return null;
    }
    public String processGetByAllVehiclesRequest() {
        return null;
    }
    public String processAddVehicleRequest() {
        return null;
    }
    public String processRemoveVehicleRequest() {
        return null;
    }


}
