package templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondProducer extends Producer{
    private static final Logger LOG = LoggerFactory.getLogger(SecondProducer.class);

    @Override
    void makeMainOperation() {
        // no main operation
        LOG.info("SKIP");
    }

    @Override
    void makeSecondOperation() {
        LOG.info("Make second operation");
    }
}
