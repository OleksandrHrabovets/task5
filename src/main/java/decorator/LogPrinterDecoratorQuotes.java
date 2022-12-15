package decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogPrinterDecoratorQuotes extends LogPrinterDecorator{
    private static final Logger LOG = LoggerFactory.getLogger(LogPrinterDecoratorQuotes.class);

    protected LogPrinterDecoratorQuotes(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        LOG.info("\"");
        printable.print();
        LOG.info("\"");
    }
}
