
package com.crud.tasks.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/v1/trello")
@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class TrelloController {

/*
    @Autowired
    private final TrelloFacade trelloFacade;

    private final SimpleEmailService simpleEmailService;
*/

/*    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloFacade.fetchTrelloBoards();
    }           */

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
    }       */

/*

    private final TrelloService trelloService;

    @GetMapping("getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloService.fetchTrelloBoards();
    }

    @PostMapping("createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloService.createTrelloCard(trelloCardDto);
    }

*/

/*    @PutMapping("updateTrelloCard")
    public CreatedTrelloCardDto updateTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return new CreatedTrelloCardDto("1", "first-name", "wp.pl");
    }

    @GetMapping("getTrelloCard")
    public CreatedTrelloCardDto getTrelloCard(Long cardId) {
        return new CreatedTrelloCardDto("2", "second-name", "o2.pl");
    }           */
}