import java.util.List;
import java.util.ArrayList;

public class TaskList {
    private List<Task> tasks = new ArrayList<Task>();

    public TaskList() {
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void print() {
        for(Task t : tasks) {
            System.out.println(t.describe());
        }
    }
}
