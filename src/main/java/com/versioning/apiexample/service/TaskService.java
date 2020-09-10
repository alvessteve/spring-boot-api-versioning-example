package com.versioning.apiexample.service;

import com.versioning.apiexample.model.Task;
import com.versioning.apiexample.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Collection<Task> findAll(){
        return taskRepository.findAll();
    }
}
