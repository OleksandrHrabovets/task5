package abstractfactory.format;

import abstractfactory.typereport.TypeReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Json implements Format {
    private static final Logger LOG = LoggerFactory.getLogger(Json.class);

    @Override
    public void save(TypeReport typeReport) {
        LOG.info("{}: saving to JSON", typeReport.getClass().getName());
    }
}
