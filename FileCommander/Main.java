package FileCommander;
import java.io.IOException;

public class Main {
    public static void main(String args[])throws InterruptedException, IOException {
        int iterationQuantity = 5;
        int delayTime=10000;
        String filePath="C:\\Users\\Computer\\Desktop\\вопросы.txt\\";
        FileOpenerOptions options= new ImplFileOpenerOptions(iterationQuantity ,delayTime, filePath);
        FileOpener worker= new ImplFileOpener();
        IterationSheduler iterator = new ImplIterationSheduler(options);
        iterator.LaunchIteration(options,worker);
    }
}