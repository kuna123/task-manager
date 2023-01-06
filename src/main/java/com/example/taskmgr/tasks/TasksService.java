package com.example.taskmgr.tasks;

import org.springframework.stereotype.Service;
import  java.util.Date;

@Service
public class TasksService {
    private final TasksRepository tasksRepository;

    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    public TaskEntity createTask(String title,String description,Date dueDate){
        TaskEntity task= new TaskEntity();
        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setCompleted(false);

    return tasksRepository.save(task);

    }

}
