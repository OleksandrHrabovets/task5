package abstractfactory;

import abstractfactory.factory.BankReportFactory;
import abstractfactory.factory.FileFormatFactory;
import abstractfactory.factory.JsonReportFactory;
import abstractfactory.factory.XmlReportFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Start application...");

        FileFormatFactory factory = new BankReportFactory();
        factory.createFormat().save(factory.createType());

        FileFormatFactory factory2 = new JsonReportFactory();
        factory2.createFormat().save(factory2.createType());

        FileFormatFactory factory3 = new XmlReportFactory();
        factory3.createFormat().save(factory3.createType());

    }

}
