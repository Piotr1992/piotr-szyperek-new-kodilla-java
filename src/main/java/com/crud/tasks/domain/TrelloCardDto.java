package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TrelloCardDto {
    private String name;
    private String description;
    private String pos;
    private String listId;
//    private Trello trello;
//    @JsonProperty("id")
    private String id;
//    private Trello trello;
//    private Badges badge;
//    @JsonProperty("badges")
    private Badges badge;
//    @JsonProperty("badge");
}