package bridge;

import bridge.color.Black;
import bridge.color.Green;
import bridge.color.Red;
import bridge.color.White;
import bridge.producer.Audi;
import bridge.producer.BMW;
import bridge.producer.KIA;
import bridge.producer.Volkswagen;
import bridge.vehicle.Car;
import bridge.vehicle.Truck;
import bridge.vehicle.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        LOG.info("Start application...");

        Vehicle car1 = new Car(new Audi(), new Black());
        LOG.info("{}", car1);
        car1.drive();

        Vehicle car2 = new Car(new Volkswagen(), new Red());
        LOG.info("{}", car2);
        car2.drive();

        Vehicle car3 = new Car(new BMW(), new Green());
        LOG.info("{}", car3);
        car3.drive();

        Vehicle truck1 = new Truck(new Audi(), new White());
        LOG.info("{}", truck1);
        truck1.drive();

        Vehicle truck2 = new Truck(new BMW(), new Black());
        LOG.info("{}", truck2);
        truck2.drive();

        Vehicle truck3 = new Truck(new KIA(), new Red());
        LOG.info("{}", truck3);
        truck3.drive();

    }
}
