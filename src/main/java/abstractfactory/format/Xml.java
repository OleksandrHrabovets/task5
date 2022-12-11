package abstractfactory.format;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Xml implements Format {
    private static final Logger LOG = LoggerFactory.getLogger(Xml.class);

    @Override
    public void save() {
        LOG.info("{}: saving to XML", getClass().getName());
    }
}
