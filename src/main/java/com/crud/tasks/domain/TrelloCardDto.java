package com.crud.tasks.domain;

import lombok.Data;

import java.util.List;

@Data
public class TrelloCardDto {
    private String name;
    private String description;
    private String pos;
    private String listId;
    private Trello trello;
//    private String id;
//    private Trello trello;
//    private Badges badges;
}