package bridge.vehicle;

import bridge.color.Color;
import bridge.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car extends Vehicle {
    private static final Logger LOG = LoggerFactory.getLogger(Car.class);
    private final Producer producer;
    private final Color color;

    public Car(Producer producer, Color color) {
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
        return "Car{" +
                "producer=" + producer.getClass().getName() +
                ", color=" + color.getClass().getName() +
                '}';
    }

    @Override
    public void drive() {
        LOG.info("Car drives");
    }
}
