package FileCommander;
import java.io.IOException;

public class Main {
    public static void main(String args[])throws InterruptedException, IOException {
        int iterationQuantity = 5;
        int delayTime=10000;
        String filePath="C:\\Users\\Computer\\Desktop\\вопросы.txt\\";
        OpenFile worker= new ImplOpenFile();
        IterationSheduler iterator = new ImplIterationSheduler(delayTime,filePath);
        iterator.LaunchIteration(iterationQuantity,worker);
    }
}