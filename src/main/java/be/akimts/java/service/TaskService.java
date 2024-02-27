package be.akimts.java.service;

import be.akimts.java.model.Task;

public interface TaskService {
        /**
     * Register the given task.
     * Gives the task a unique ID.
     *
     * @param task
     * @return the created task with a unique ID.
     */
    Task create(Task task);

    /**
     * Gets a task that has the given ID.
     *
     * @param id the id of the wanted Task.
     * @throws RuntimeException If there are no Tasks with such ID.
     * @return a Task with the given ID.
     */
    Task getOne(Long id);

    /**
     * Deletes a task with the given ID.
     * If there are no sush tasks, no Task shoulc be deleted.
     *
     * @param id
     */
    void delete(Long id);
}
