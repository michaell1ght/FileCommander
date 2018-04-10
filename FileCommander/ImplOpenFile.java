package FileCommander;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImplOpenFile implements OpenFile {
    @Override
    public void OpenFileDelayedByPath(int delayTime, String filePath) throws InterruptedException, IOException {
            File file = new File(filePath);
                Desktop.getDesktop().open(file);
                Thread.sleep(delayTime);
    }
}