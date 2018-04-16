package FileCommander;
import java.io.IOException;

public  class ImplIterationSheduler implements IterationSheduler {
    private FileOpenerOptions options;
    ImplIterationSheduler(FileOpenerOptions options)
    {this.options=options;
    }
    @Override
    public void LaunchIteration(FileOpenerOptions options,FileOpener worker) throws InterruptedException, IOException {
        for (int i = 0; i <options.GetIterationQuantity(); i++) {
            worker.OpenFileDelayedByPath(options);
        }
    }
}