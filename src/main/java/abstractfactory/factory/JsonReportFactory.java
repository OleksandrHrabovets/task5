package abstractfactory.factory;

import abstractfactory.format.Format;
import abstractfactory.format.Json;
import abstractfactory.typereport.Sales;
import abstractfactory.typereport.TypeReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonReportFactory implements FileFormatFactory {
    private static final Logger LOG = LoggerFactory.getLogger(JsonReportFactory.class);

    @Override
    public Format createFormat() {
        LOG.info("Creating JSON report format...");
        return new Json();
    }

    @Override
    public TypeReport createType() {
        return new Sales();
    }
}
