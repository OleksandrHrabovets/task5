package abstractfactory;

import abstractfactory.factory.BankReportFactory;
import abstractfactory.factory.JsonReportFactory;
import abstractfactory.factory.XmlReportFactory;
import abstractfactory.format.Format;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Start application...");

        Format format1 = new BankReportFactory().createFormat();
        format1.save();

        Format format2 = new JsonReportFactory().createFormat();
        format2.save();

        Format format3 = new XmlReportFactory().createFormat();
        format3.save();

    }

}
