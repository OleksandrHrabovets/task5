package factorymethod.factory;

import factorymethod.transport.Transport;
import factorymethod.transport.Truck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TruckCreator implements Creator{
    private static final Logger LOG = LoggerFactory.getLogger(TruckCreator.class);

    @Override
    public Transport create() {
        LOG.info("{}: creating truck", getClass().getName());
        return new Truck();
    }
}
