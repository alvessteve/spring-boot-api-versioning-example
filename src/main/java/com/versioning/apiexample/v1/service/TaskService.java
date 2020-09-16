package com.versioning.apiexample.v1.service;

import com.versioning.apiexample.v1.model.Task;
import com.versioning.apiexample.v1.repository.TaskRepository;
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
