package re2022final.onetwo;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList<Task>();

    public TaskList(){
    }

    void addTask(Task st){
        tasks.add(st);
    }

    void print(){
        for (Task t : tasks){
            System.out.println(t.describe());
        }
    }
}
