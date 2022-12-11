package factorymethod.transport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Truck implements Transport{
    private static final Logger LOG = LoggerFactory.getLogger(Truck.class);

    @Override
    public void delivery() {
        LOG.info("{}: delivery", getClass().getName());
    }
}
