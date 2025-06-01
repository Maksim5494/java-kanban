import java.util.ArrayList;
import java.util.HashMap;
import tasks.Task;

public class TaskManager {
    private HashMap<Long, Task> tasks = new HashMap<>();
    private long generatorId = 1;


    public Task getTask(long id) {
        return tasks.get(id);
    }

    public ArrayList<Task> getTasks(){
        return new ArrayList<>(tasks.values());
    }

    public Task createTask(Task task) {
        task.setId(getNextId());
        tasks.put(task.getId(), task);
        return task;
    }
    public Task updateTask(Task task){
        tasks.put(task.getId(), task);
        return task;
    }

    public Task deleteTask(long id){
        return tasks.remove(id);
    }

    public void deleteTasks() {
        tasks.clear();
    }

    private long getNextId(){
        return generatorId++;
    }
}
