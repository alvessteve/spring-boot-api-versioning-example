package com.versioning.apiexample.v1.controller;

import com.versioning.apiexample.v1.model.Task;
import com.versioning.apiexample.v1.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class TaskControllerV1 {

    private TaskService taskService;

    public TaskControllerV1(TaskService taskService) {
        this.taskService = taskService;
    }

    @ResponseBody
    @GetMapping(value = "/tasks", produces = "application/vnd.myself.api.v1+json")
    public Collection<Task> findAllTasks() {
        return taskService.findAll();
    }

}
