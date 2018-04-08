package FileCommander;
import java.io.IOException;

public class ShedulerIterator implements ShedulerInput {
   /* private int Time;
    private String Path;
    private int iterations;

    String filePath = this.Path;
    int iterationQuantity=this.iterations;
    int delayTime = this.Time;*/
    @Override
    public void LaunchIterator(int iterationQuantity,int delayTime, String filePath, FileWorker worker) throws InterruptedException, IOException {
        for (int i = 0; i < iterationQuantity; i++) {
            worker.fileOpener(delayTime, filePath);
        }
    }
}
