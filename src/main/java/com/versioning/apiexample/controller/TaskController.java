package com.versioning.apiexample.controller;

import com.versioning.apiexample.model.Task;
import com.versioning.apiexample.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @ResponseBody
    @GetMapping(value = "/tasks")
    public Collection<Task> findAllTasks() {
        return taskService.findAll();
    }

}
