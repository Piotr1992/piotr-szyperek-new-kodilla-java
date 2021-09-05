package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class TaskMapperTestSuite {

    @InjectMocks
    private TaskMapper taskMapper;

    @Test
    public void testTaskMapper() {

        //Given
        Task task = new Task(7L, "titleTask", "contentTask");
        TaskDto taskDto = new TaskDto(21L, "titleTaskDto", "contentTaskDto");
        List<Task> taskList = new ArrayList<>();
        taskList.add(task);

        //When
        Task resultTask = taskMapper.mapToTask(taskDto);
        TaskDto resultTaskDto = taskMapper.mapToTaskDto(task);
        List<TaskDto> resultTaskDtoList = taskMapper.mapToTaskDtoList(taskList);

        //Then
        assertNotNull(resultTask);
        assertNotNull(resultTaskDto);
        assertNotNull(resultTaskDtoList);

    }

}
