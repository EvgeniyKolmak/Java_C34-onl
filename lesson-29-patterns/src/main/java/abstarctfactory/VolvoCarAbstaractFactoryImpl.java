package abstarctfactory;

public class VolvoCarAbstaractFactoryImpl implements CarAbstaractFactory {
    @Override
    public CarcassService createCarcassService() {
        return new VolvoCarcassServiceImpl();
    }

    @Override
    public EngineService createEngineService() {
        return new VolvoEngineServiceImpl();
    }

    @Override
    public WheelService createWheelService() {
        return new VolvoWheelServiceImpl();
    }
}
