package FileCommander;

import java.io.IOException;

public interface IterationSheduler {
    void LaunchIteration(int iterationQuantity,OpenFile worker) throws InterruptedException, IOException;
}
