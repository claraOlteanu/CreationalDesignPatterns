package Lab1.BonusEx;

public class CarManagementApplication {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setEngine("V12")
                .setTransmission("Manual")
                .addInteriorFeature("Leather Seats")
                .addExteriorOption("Sunroof")
                .addExteriorOption("Fog Lights")
                .addSafetyFeature("ABS")
                .build();

        System.out.println("Configured Car: " + car);

        String docType = "PDF";
        Document document = DocumentFactory.createDocument(docType);

        document.save(car.getConfigurationDetails());
        document.show();
    }
}

