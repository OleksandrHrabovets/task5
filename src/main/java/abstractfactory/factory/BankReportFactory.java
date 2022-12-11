package abstractfactory.factory;

import abstractfactory.format.Format;
import abstractfactory.format.Pdf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankReportFactory implements FileFormatFactory {
    private static final Logger LOG = LoggerFactory.getLogger(BankReportFactory.class);

    @Override
    public Format createFormat() {
        LOG.info("Creating bank report format...");
        return new Pdf();
    }
}
