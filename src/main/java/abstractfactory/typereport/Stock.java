package abstractfactory.typereport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stock implements TypeReport {
    private static final Logger LOG = LoggerFactory.getLogger(Stock.class);

    @Override
    public void generate() {
        LOG.info("{}: generating stock report", getClass().getName());
    }
}
