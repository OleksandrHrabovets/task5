package decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Start application...");

        Printable printable = new LogPrinterDecoratorBrackets(
                new LogPrinterDecoratorQuotes(
                        new LogPrinter("String for print")));
        printable.print();
    }
}
