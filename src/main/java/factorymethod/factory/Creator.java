package factorymethod.factory;

import factorymethod.transport.Transport;

public interface Creator {
    Transport create();
}
