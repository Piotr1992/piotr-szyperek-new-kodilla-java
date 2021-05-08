
package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCard;
import com.crud.tasks.domain.Mail;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.service.SimpleEmailService;
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

    private final SimpleEmailService simpleEmailService;

    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }

    @PostMapping("createTrelloCard")
    public CreatedTrelloCard postTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
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

/*    @PutMapping("updateTrelloCard")
    public CreatedTrelloCard updateTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return new CreatedTrelloCard(1L, "safd", "dsag");
    }

    @GetMapping("getTrelloCard")
    public CreatedTrelloCard getTrelloCard(Long cardId) {
        return new CreatedTrelloCard(1L, "", "");
    }           */
}