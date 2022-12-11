package bridge.vehicle;

import bridge.color.Color;
import bridge.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Truck extends Vehicle {
    private static final Logger LOG = LoggerFactory.getLogger(Truck.class);

    private final Producer producer;
    private final Color color;

    public Truck(Producer producer, Color color) {
        this.producer = producer;
        this.color = color;
    }

    public Producer getProducer() {
        return producer;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "producer=" + producer.getClass().getName() +
                ", color=" + color.getClass().getName() +
                '}';
    }

    @Override
    public void drive() {
        LOG.info("Truck drives");
    }
}
