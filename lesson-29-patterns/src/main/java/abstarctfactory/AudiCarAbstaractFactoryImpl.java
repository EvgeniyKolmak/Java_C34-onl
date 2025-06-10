package abstarctfactory;

public class AudiCarAbstaractFactoryImpl implements CarAbstaractFactory {
    @Override
    public CarcassService createCarcassService() {
        return new AudiCarcassServiceImpl();
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
