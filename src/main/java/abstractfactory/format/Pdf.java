package abstractfactory.format;

import abstractfactory.typereport.TypeReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pdf implements Format {
    private static final Logger LOG = LoggerFactory.getLogger(Pdf.class);

    @Override
    public void save(TypeReport typeReport) {
        LOG.info("{}: saving to PDF", typeReport.getClass().getName());
    }
}
