package abstractfactory.factory;

import abstractfactory.format.Format;
import abstractfactory.typereport.TypeReport;

public interface FileFormatFactory {
    Format createFormat();
    TypeReport createType();
}
