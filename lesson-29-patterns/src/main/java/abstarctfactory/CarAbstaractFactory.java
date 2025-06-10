package abstarctfactory;

public interface CarAbstaractFactory {

    CarcassService createCarcassService();

    EngineService createEngineService();

    WheelService createWheelService();

}
