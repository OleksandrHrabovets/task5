package abstractfactory.format;

import abstractfactory.typereport.TypeReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Xml implements Format {
    private static final Logger LOG = LoggerFactory.getLogger(Xml.class);

    @Override
    public void save(TypeReport typeReport) {
        LOG.info("{}: saving to XML", typeReport.getClass().getName());
    }
}
