package decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogPrinterDecoratorBrackets extends LogPrinterDecorator{
    private static final Logger LOG = LoggerFactory.getLogger(LogPrinterDecoratorBrackets.class);

    protected LogPrinterDecoratorBrackets(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        LOG.info("[");
        printable.print();
        LOG.info("]");
    }
}
