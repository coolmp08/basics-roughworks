
// Java program to demonstrate the
// Implementation of getActiveThreadCount()

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class NewTask extends RecursiveAction
{
    private long Load = 0;

    public NewTask(long Load) { this.Load = Load;
    System.out.println("printed the number: " + Load);
        var load = Load;
        calculatePower (Load);
    }

    private long calculatePower(long load){
        long ret = 0;

        if(load<5){
            double d = Math.pow(2,load);
            System.out.println("power table of 2 is : " + d);
        }

        return ret;
    }

    protected void compute()
    {
        // fork tasks into smaller subtasks
        List<NewTask> subtasks = new ArrayList<>();
        subtasks.addAll(createSubtasks());

        for (RecursiveAction subtask : subtasks) {
            subtask.fork();
        }
    }

    // function to create and add subtasks
    private List<NewTask> createSubtasks()
    {
        // create subtasks
        List<NewTask> subtasks = new ArrayList<>();
        NewTask subtask1 = new NewTask(this.Load / 3);
        NewTask subtask2 = new NewTask(this.Load / 3);
        NewTask subtask3 = new NewTask(this.Load / 3);

        // to add the subtasks
        subtasks.add(subtask1);
        subtasks.add(subtask2);
        subtasks.add(subtask3);

        return subtasks;
    }
}
public class ForkJoinPoolActiveThreadCountDemo {
    public static void main(final String[] arguments)
            throws InterruptedException
    {
        // get no. of available core available
        int proc = Runtime.getRuntime().availableProcessors();

        System.out.println("Number of available core in the processor is: "
                + proc);

        // get no. of threads active
        ForkJoinPool Pool = ForkJoinPool.commonPool();

        System.out.println("Number of active thread before invoking: "
                + Pool.getActiveThreadCount());

        NewTask t = new NewTask(6);

        Pool.invoke(t);

        System.out.println("Number of active thread after invoking: "
                + Pool.getActiveThreadCount());
        System.out.println("Common Pool Size is: "
                + Pool.getPoolSize());
    }
}

