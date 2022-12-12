package abstractfactory.factory;

import abstractfactory.format.Format;
import abstractfactory.format.Xml;
import abstractfactory.typereport.Stock;
import abstractfactory.typereport.TypeReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlReportFactory implements FileFormatFactory {
    private static final Logger LOG = LoggerFactory.getLogger(XmlReportFactory.class);

    @Override
    public Format createFormat() {
        LOG.info("Creating XML report format...");
        return new Xml();
    }

    @Override
    public TypeReport createType() {
        return new Stock();
    }
}
