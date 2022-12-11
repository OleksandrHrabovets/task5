package factorymethod.transport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Transport{
    private static final Logger LOG = LoggerFactory.getLogger(Car.class);

    @Override
    public void delivery() {
        LOG.info("{}: delivery", getClass().getName());
    }
}
