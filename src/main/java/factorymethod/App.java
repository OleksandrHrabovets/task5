package factorymethod;

import factorymethod.factory.CarCreator;
import factorymethod.factory.TruckCreator;
import factorymethod.transport.Transport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Start application...");

        Transport transport1 = new CarCreator().create();
        transport1.delivery();

        Transport transport2 = new CarCreator().create();
        transport2.delivery();

        Transport transport3 = new TruckCreator().create();
        transport3.delivery();

        Transport transport4 = new TruckCreator().create();
        transport4.delivery();

    }

}
