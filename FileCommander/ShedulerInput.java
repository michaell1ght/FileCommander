package FileCommander;

import java.io.IOException;

public interface ShedulerInput {
    void LaunchIterator(int iterationQuantity, int delayTime, String filePath, FileWorker worker) throws InterruptedException, IOException;
}
