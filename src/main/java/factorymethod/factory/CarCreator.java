package factorymethod.factory;

import factorymethod.transport.Car;
import factorymethod.transport.Transport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarCreator extends Creator {
    private static final Logger LOG = LoggerFactory.getLogger(CarCreator.class);

    @Override
    public Transport create() {
        LOG.info("{}: creating car", getClass().getName());
        return new Car();
    }
}
