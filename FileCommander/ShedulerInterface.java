package FileCommander;

import java.io.IOException;

public interface ShedulerInterface {
    void LaunchIterator(int iterationQuantity, int delayTime, String filePath, FileOpenInterface worker) throws InterruptedException, IOException;
}
