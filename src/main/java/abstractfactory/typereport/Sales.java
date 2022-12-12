package abstractfactory.typereport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sales implements TypeReport {
    private static final Logger LOG = LoggerFactory.getLogger(Sales.class);

    @Override
    public void generate() {
        LOG.info("{}: generating sales report", getClass().getName());
    }
}
