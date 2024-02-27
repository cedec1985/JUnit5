package be.akimts.java.service;

import be.akimts.java.model.Task;

import java.util.HashMap;
import java.util.Map;

public class TaskServiceImpl implements TaskService{
      private Long nextID = 1L;
    private Map<Long, Task> tasks = new HashMap<>();

    @Override
    public Task create(Task task) {
        task.setId(nextID++);
        tasks.put(task.getId(), task);
        return task;
    }

    @Override
    public Task getOne(Long id) {
        if( !tasks.containsKey(id) )
            throw new RuntimeException("No task with id: " + id);

        return tasks.get(id);
    }

    @Override
    public void delete(Long id) {
        tasks.remove(id);
    }
}

