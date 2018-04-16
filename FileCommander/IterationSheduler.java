package FileCommander;

import java.io.IOException;

public interface IterationSheduler {
    void LaunchIteration(FileOpenerOptions options,FileOpener worker) throws InterruptedException, IOException;
}
