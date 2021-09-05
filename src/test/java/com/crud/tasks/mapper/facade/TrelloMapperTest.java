package com.crud.tasks.mapper.facade;

import com.crud.tasks.domain.*;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.mapper.TrelloMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class TrelloMapperTest {

    @InjectMocks
    private TrelloMapper trelloMapper;

    @InjectMocks
    private TaskMapper taskMapper;

    @Test
    public void testMapper() {

        //Given
        List<TrelloList> trelloLists = new ArrayList<>();
        List<TrelloListDto> trelloListDto = new ArrayList<>();
        TrelloBoard trelloBoard = new TrelloBoard("2", "Sceond", trelloLists);
        TrelloCard trelloCard = new TrelloCard("name", "desc", "pos", "listId");
        TrelloCardDto trelloCardDto = new TrelloCardDto("nameDto", "descDto", "posDto", "listIdDto");
        TrelloBoardDto trelloBoardDto = new TrelloBoardDto("5", "five", trelloLists);
        List<TrelloBoard> trelloBoardList = new ArrayList<>();
        trelloBoardList.add(trelloBoard);
        List<TrelloBoardDto> trelloBoardDtoList = new ArrayList<>();
        trelloBoardDtoList.add(trelloBoardDto);
        Task task = new Task(7L, "titleTask", "contentTask");
        TaskDto taskDto = new TaskDto(21L, "titleTaskDto", "contentTaskDto");
        List<Task> taskList = new ArrayList<>();
        taskList.add(task);

        //When
        trelloBoardList = trelloMapper.mapToBoards(trelloBoardDtoList);
        trelloBoardDtoList = trelloMapper.mapToBoardsDto(trelloBoardList);
        TrelloBoard trelloBoard2 = trelloMapper.mapToBoard(trelloBoard);
        List<TrelloList> listList1 = trelloMapper.mapToList(trelloListDto);
        List<TrelloList> listList2 = trelloMapper.mapToListDto(trelloLists);
        TrelloCardDto resultTrelloCardDto = trelloMapper.mapToCardDto(trelloCard);
        TrelloCard resultTrelloCard = trelloMapper.mapToCard(trelloCardDto);
        Task resultTask = taskMapper.mapToTask(taskDto);
        TaskDto resultTaskDto = taskMapper.mapToTaskDto(task);
        List<TaskDto> resultTaskDtoList = taskMapper.mapToTaskDtoList(taskList);

        //Then
        assertNotNull(trelloBoardList);
        assertNotNull(trelloBoardDtoList);
        assertNotNull(trelloBoard2);
        assertNotNull(listList1);
        assertNotNull(listList2);
        assertNotNull(resultTrelloCardDto);
        assertNotNull(resultTrelloCard);
        assertNotNull(resultTask);
        assertNotNull(resultTaskDto);
        assertNotNull(resultTaskDtoList);

    }

}
