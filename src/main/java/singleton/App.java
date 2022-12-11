package singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("Start application...");

        for (int i = 0; i < 10; i++) {
            // hashcode of singleton object is always the same
            LOG.info("{}",SimpleSingleton.getInstance());
        }
    }
}
