package bridge.vehicle;

import bridge.color.Color;
import bridge.producer.Producer;

public abstract class Vehicle {

    protected final Producer producer;
    protected final Color color;

    protected Vehicle(Producer producer, Color color) {
        this.producer = producer;
        this.color = color;
    }

    public Producer getProducer() {
        return producer;
    }

    public Color getColor() {
        return color;
    }

    public abstract void drive();

}
