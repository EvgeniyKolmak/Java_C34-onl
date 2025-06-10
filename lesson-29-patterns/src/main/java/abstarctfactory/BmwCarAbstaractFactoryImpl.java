package abstarctfactory;

public class BmwCarAbstaractFactoryImpl implements CarAbstaractFactory {
    @Override
    public CarcassService createCarcassService() {
        return new BmwCarcassServiceImpl();
    }

    @Override
    public EngineService createEngineService() {
        return new BmwEngineServiceImpl();
    }

    @Override
    public WheelService createWheelService() {
        return new VolvoWheelServiceImpl();
    }
}
