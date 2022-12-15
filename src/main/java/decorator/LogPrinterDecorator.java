package decorator;

public abstract class LogPrinterDecorator implements Printable {

    protected final Printable printable;

    protected LogPrinterDecorator(Printable printable) {
        this.printable = printable;
    }

}
