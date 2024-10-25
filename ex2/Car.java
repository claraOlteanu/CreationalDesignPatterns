package Lab1.ex2;

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
}
