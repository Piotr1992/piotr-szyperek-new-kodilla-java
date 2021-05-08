
package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCardDto;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.trello.client.TrelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/trello")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TrelloController {

    private final TrelloClient trelloClient;

    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }

    @PostMapping("createTrelloCard")
    public CreatedTrelloCardDto postTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloClient.createNewCard(trelloCardDto);
    }

    @PutMapping("updateTrelloCard")
    public CreatedTrelloCardDto updateTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return new CreatedTrelloCardDto();
    }

    @GetMapping("getTrelloCard")
    public CreatedTrelloCardDto getTrelloCard(Long cardId) {
        return new CreatedTrelloCardDto();
    }
}