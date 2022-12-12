package abstractfactory.typereport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Balance implements TypeReport {
    private static final Logger LOG = LoggerFactory.getLogger(Balance.class);

    @Override
    public void generate() {
        LOG.info("{}: generating balance report", getClass().getName());
    }
}
