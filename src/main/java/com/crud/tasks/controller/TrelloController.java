
package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCardDto;
import com.crud.tasks.domain.Mail;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.service.SimpleEmailService;
import com.crud.tasks.trello.client.TrelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/trello")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TrelloController {

/*    @Autowired
    private final TrelloFacade trelloFacade;        */

    @Autowired
    private final TrelloClient trelloClient;

    private final SimpleEmailService simpleEmailService;

/*    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloFacade.fetchTrelloBoards();
    }           */



    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }

    @PostMapping("createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        simpleEmailService.send(
                new Mail(
                        "szyperekpiotr1992@gmail.com",
                        "Recipient",
                        "Subject",
                        "Message"
                )
        );
        return trelloClient.createNewCard(trelloCardDto);
    }




/*    @PostMapping("createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {

        simpleEmailService.send(
                new Mail(
                        "szyperekpiotr1992@gmail.com",
                        "Recipient",
                        "Subject",
                        "Message"
                )
        );

        return trelloFacade.createCard(trelloCardDto);
    }

    private final TrelloService trelloService;

    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloService.fetchTrelloBoards();
    }               */

/*    @PostMapping("createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloService.createTrelloCard(trelloCardDto);
    }               */

/*    @PutMapping("updateTrelloCard")
    public CreatedTrelloCardDto updateTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return new CreatedTrelloCardDto("1", "first-name", "wp.pl");
    }

    @GetMapping("getTrelloCard")
    public CreatedTrelloCardDto getTrelloCard(Long cardId) {
        return new CreatedTrelloCardDto("2", "second-name", "o2.pl");
    }               */
}