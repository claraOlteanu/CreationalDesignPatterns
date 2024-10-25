package Lab1.BonusEx;

class Car {
    private String engine;
    private String transmission;
    private String interiorFeatures;
    private String exteriorOptions;
    private String safetyFeatures;

    public Car(String engine, String transmission, String interiorFeatures, String exteriorOptions, String safetyFeatures) {
        this.engine = engine;
        this.transmission = transmission;
        this.interiorFeatures = interiorFeatures;
        this.exteriorOptions = exteriorOptions;
        this.safetyFeatures = safetyFeatures;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", interiorFeatures='" + interiorFeatures + '\'' +
                ", exteriorOptions='" + exteriorOptions + '\'' +
                ", safetyFeatures='" + safetyFeatures + '\'' +
                '}';
    }

    public String getConfigurationDetails() {
        return toString();
    }
}

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

