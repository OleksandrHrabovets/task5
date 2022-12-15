package templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Start application...");

        Producer producer = new MainProducer();
        producer.produce();

        LOG.info("-------------------------------------");

        Producer secondProducer = new SecondProducer();
        secondProducer.produce();

    }
}
