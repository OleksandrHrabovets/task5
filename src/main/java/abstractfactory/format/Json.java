package abstractfactory.format;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Json implements Format {
    private static final Logger LOG = LoggerFactory.getLogger(Json.class);

    @Override
    public void save() {
        LOG.info("{}: saving to JSON", getClass().getName());
    }
}
