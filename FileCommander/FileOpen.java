package FileCommander;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileOpen implements FileOpenInterface {
    /*private int delayTime;
    int delayTime=this.delayTime;
    private String filePath;
    String filePath=this.filePath;*/
    @Override
    public void fileOpener(int delayTime, String filePath) throws InterruptedException, IOException {
            File file = new File(filePath);
                Desktop.getDesktop().open(file);
                Thread.sleep(delayTime);
    }
}