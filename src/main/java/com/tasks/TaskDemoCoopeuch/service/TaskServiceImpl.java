package com.tasks.TaskDemoCoopeuch.service;

import com.tasks.TaskDemoCoopeuch.dto.TaskDTO;
import com.tasks.TaskDemoCoopeuch.entity.Task;
import com.tasks.TaskDemoCoopeuch.exception.ResourceNotFoundException;
import com.tasks.TaskDemoCoopeuch.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class TaskServiceImpl implements ITaskService {

    private final TaskRepository taskRepository;
    private ModelMapper mapper;
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Integer id){
        return taskRepository
                .findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
    public Task create(TaskDTO taskDTO) {
        Task task = mapper.map(taskDTO, Task.class);

        task.setCreatedAt(LocalDateTime.now());
        return taskRepository.save(task);
    }

    public Task update(Integer id, TaskDTO taskDTO ) {
        Task taskFromDb = this.findById(id);

        mapper.map(taskDTO, taskFromDb);

        return taskRepository
                .save(taskFromDb);
    }


    public void delete(Integer id ) {
        Task taskFromDb = this.findById(id);
        taskRepository.delete(taskFromDb);

    }
}
