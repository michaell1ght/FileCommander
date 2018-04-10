package FileCommander;

import java.io.IOException;

public interface OpenFile{
    void OpenFileDelayedByPath(int delayTime, String filePath) throws InterruptedException, IOException;
}