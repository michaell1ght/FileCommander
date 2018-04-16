package FileCommander;

public class ImplFileOpenerOptions implements FileOpenerOptions {
    private int iterationQuantity;
    private int delayTime;
    private String filePath;

    ImplFileOpenerOptions(int iterationQuantity, int delayTime, String filePath) {
        this.iterationQuantity=iterationQuantity;
        this.delayTime=delayTime;
        this.filePath=filePath;
    }
    @Override
public int GetIterationQuantity() {
     return iterationQuantity;
    }
    @Override
    public int GetDelayTime() {
        return delayTime;
    }
    @Override
    public String GetFilePath() {
        return filePath;
    }
}
