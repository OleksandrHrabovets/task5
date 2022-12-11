package abstractfactory.format;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pdf implements Format {
    private static final Logger LOG = LoggerFactory.getLogger(Pdf.class);

    @Override
    public void save() {
        LOG.info("{}: saving to PDF", getClass().getName());
    }
}
