package abstractfactory.format;

import abstractfactory.typereport.TypeReport;

public interface Format {
    void save(TypeReport typeReport);
}
