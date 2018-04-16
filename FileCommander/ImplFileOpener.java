package FileCommander;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImplFileOpener implements FileOpener {
    private FileOpenerOptions  options;
    @Override
    public void OpenFileDelayedByPath(FileOpenerOptions options) throws InterruptedException, IOException {
        this.options=options;
        File file = new File(options.GetFilePath());
                Desktop.getDesktop().open(file);
                Thread.sleep(options.GetDelayTime());
    }
}