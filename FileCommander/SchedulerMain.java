package FileCommander;
import java.io.IOException;

public class SchedulerMain {
    public static void main(String args[])throws InterruptedException, IOException {
        int iterationQuantity = 5;
        int delayTime=10000;
        String filePath="C:\\Users\\Computer\\Desktop\\вопросы.txt\\";
        FileWorker worker= new FileWorker();
        ShedulerInput iterator = new ShedulerIterator();
        iterator.LaunchIterator(iterationQuantity,delayTime,filePath,worker);
    }
}