package FileCommander;
import java.io.IOException;

public  class ImplIterationSheduler implements IterationSheduler {
    private int delayTime;
    private String filePath;
    ImplIterationSheduler(int delayTime, String filePath){
    this.delayTime=delayTime;
    this.filePath=filePath;
    }
    @Override
    public void LaunchIteration(int iterationQuantity,OpenFile worker) throws InterruptedException, IOException {
        for (int i = 0; i < iterationQuantity; i++) {
            worker.OpenFileDelayedByPath(delayTime, filePath);
        }
    }
}