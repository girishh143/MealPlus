package K12PaymentCenter;

import java.io.IOException;

public interface BasePage {
    /**
     * Verifies if the page is fully loaded
     *
     * @return true if the page is fully loaded, otherwise false
     * @throws InterruptedException Exception: Sleep failed
     * @throws IOException          Something unexpected happen
     */
    boolean isLoaded() throws IOException, InterruptedException;
}
