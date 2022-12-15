package templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Producer {
    private static final Logger LOG = LoggerFactory.getLogger(Producer.class);

    abstract void makeMainOperation();
    abstract void makeSecondOperation();

    void produce() {
        startProduce();
        makeMainOperation();
        makeSecondOperation();
        finishProduce();
    }

    void startProduce() {
        LOG.info("Start produce...");
    }

    void finishProduce() {
        LOG.info("Finish produce...");
    }

}
