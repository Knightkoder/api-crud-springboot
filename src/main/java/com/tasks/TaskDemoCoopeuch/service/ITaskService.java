package com.tasks.TaskDemoCoopeuch.service;

import com.tasks.TaskDemoCoopeuch.dto.TaskDTO;
import com.tasks.TaskDemoCoopeuch.entity.Task;

import java.util.List;

public interface ITaskService {

    Iterable<Task> findAll();

    Task findById(Integer id);

    Task create(TaskDTO task);

}
