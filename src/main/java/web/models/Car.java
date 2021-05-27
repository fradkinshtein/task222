package web.models;

public class Car {
    private String carProducer;
    private String carModel;
    private String carColor;

    public Car(){}

    public Car(String carProducer, String carModel, String carColor) {
        this.carProducer = carProducer;
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public String getCarProducer() {
        return carProducer;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }
}
