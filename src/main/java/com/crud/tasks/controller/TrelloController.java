
package com.crud.tasks.controller;

import com.crud.tasks.trello.facade.TrelloFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/trello")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TrelloController {

    @Autowired
    private final TrelloFacade trelloFacade;

/*    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloFacade.fetchTrelloBoards();
    }           */

/*    @PostMapping("createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloFacade.createCard(trelloCardDto);
    }           */

/*    private final TrelloService trelloService;

    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloService.fetchTrelloBoards();
    }

    @PostMapping("createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloService.createTrelloCard(trelloCardDto);
    }               */

/*    @PutMapping("updateTrelloCard")
    public CreatedTrelloCardDto updateTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return new CreatedTrelloCardDto(1L, "safd", "dsag");
    }

    @GetMapping("getTrelloCard")
    public CreatedTrelloCardDto getTrelloCard(Long cardId) {
        return new CreatedTrelloCardDto(1L, "", "");
    }           */
}