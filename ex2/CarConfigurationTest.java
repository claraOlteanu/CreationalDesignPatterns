package Lab1.ex2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarConfiguratorTest {

    @Test
    void testDefaultCarBuild() {
        Car car = new CarBuilder().build();
        assertNotNull(car, "Car object should be created");
        assertTrue(car.toString().contains("engine='V6'"), "Default engine should be V6");
        assertTrue(car.toString().contains("transmission='Automatic'"), "Default transmission should be Automatic");
    }

    @Test
    void testCustomEngineAndTransmission() {
        Car car = new CarBuilder()
                .setEngine("V12")
                .setTransmission("Manual")
                .build();

        assertTrue(car.toString().contains("engine='V12'"), "Engine should be V12");
        assertTrue(car.toString().contains("transmission='Manual'"), "Transmission should be Manual");
    }

    @Test
    void testInteriorFeatures() {
        Car car = new CarBuilder()
                .addInteriorFeature("Leather Seats")
                .addInteriorFeature("GPS")
                .build();

        assertTrue(car.toString().contains("Leather Seats"), "Interior should contain Leather Seats");
        assertTrue(car.toString().contains("GPS"), "Interior should contain GPS");
    }

    @Test
    void testExteriorOptions() {
        Car car = new CarBuilder()
                .addExteriorOption("Sunroof")
                .addExteriorOption("Fog Lights")
                .build();

        assertTrue(car.toString().contains("Sunroof"), "Exterior should contain Sunroof");
        assertTrue(car.toString().contains("Fog Lights"), "Exterior should contain Fog Lights");
    }

    @Test
    void testSafetyFeatures() {
        Car car = new CarBuilder()
                .addSafetyFeature("ABS")
                .addSafetyFeature("Airbags")
                .build();

        assertTrue(car.toString().contains("ABS"), "Safety features should contain ABS");
        assertTrue(car.toString().contains("Airbags"), "Safety features should contain Airbags");
    }
}

