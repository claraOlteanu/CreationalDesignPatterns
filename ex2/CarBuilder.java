package Lab1.ex2;

class CarBuilder {
    private String engine = "V6";
    private String transmission = "Automatic";
    private String interiorFeatures = "";
    private String exteriorOptions = "";
    private String safetyFeatures = "";

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder addInteriorFeature(String feature) {
        this.interiorFeatures += feature + ", ";
        return this;
    }

    public CarBuilder addExteriorOption(String option) {
        this.exteriorOptions += option + ", ";
        return this;
    }

    public CarBuilder addSafetyFeature(String feature) {
        this.safetyFeatures += feature + ", ";
        return this;
    }

    public Car build() {
        return new Car(engine, transmission, interiorFeatures, exteriorOptions, safetyFeatures);
    }
}
