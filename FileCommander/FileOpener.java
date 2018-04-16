package FileCommander;

import java.io.IOException;

public interface FileOpener{
    void OpenFileDelayedByPath(FileOpenerOptions options) throws InterruptedException, IOException;
}