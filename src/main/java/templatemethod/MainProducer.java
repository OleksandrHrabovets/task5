package templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProducer extends Producer{
    private static final Logger LOG = LoggerFactory.getLogger(MainProducer.class);

    @Override
    void makeMainOperation() {
        LOG.info("Make main operation");
    }

    @Override
    void makeSecondOperation() {
        // no second operation
        LOG.info("SKIP");
    }
}
