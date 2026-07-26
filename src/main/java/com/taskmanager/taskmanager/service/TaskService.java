package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.dto.request.TaskRequest;
import com.taskmanager.taskmanager.dto.response.TaskResponse;

import java.util.List;

public interface TaskService {

    // Create Task
    TaskResponse createTask(TaskRequest request);

    // Get All Tasks
    List<TaskResponse> getAllTasks();

    // Get Task By ID
    TaskResponse getTaskById(Long id);

    // Update Task
    TaskResponse updateTask(Long id, TaskRequest request);

    // Delete Task
    void deleteTask(Long id);

    // Search Tasks By Title
    List<TaskResponse> searchTasks(String title);
}