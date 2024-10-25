package Lab1.ex2;

public class CarConfigurator {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setEngine("V12")
                .setTransmission("Manual")
                .addInteriorFeature("Leather Seats")
                .addExteriorOption("Sunroof")
                .addSafetyFeature("rear camera")
                .build();

        System.out.println(car);
    }
}