package decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogPrinter implements Printable {
    private final String string;

    private static final Logger LOG = LoggerFactory.getLogger(LogPrinter.class);

    public LogPrinter(String string) {
        this.string = string;
    }

    @Override
    public void print() {
        LOG.info(string);
    }
}
