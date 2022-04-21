package blockChainHW3_120191212;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author abdQaddora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = getRandomPort();
        blockChain bl = new blockChain(port);
        bl.mine();
    }

    public static int getRandomPort() {
        return (int) (Math.random() * 1000 + 1000);
    }
}
