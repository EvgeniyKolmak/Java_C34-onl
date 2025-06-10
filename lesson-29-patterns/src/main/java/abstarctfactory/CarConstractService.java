package abstarctfactory;

public class CarConstractService {

    public Car create(CarAbstaractFactory factory) {
        return new Car(factory.createCarcassService().getCarcass(), factory.createEngineService().getEngine(), factory.createWheelService().getWheel());
    }

}
