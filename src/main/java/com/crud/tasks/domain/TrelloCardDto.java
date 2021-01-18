package com.crud.tasks.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TrelloCardDto {
    private String name;
    private String description;
    private String pos;
    private String listId;
    private String id;
    private Badges badge;

    public Object[] getListBadges() {
        List<Badges> listBadges = new ArrayList<Badges>();
        listBadges.forEach(listBadgesDto -> {
            listBadges.forEach(listBad -> {
                listBad.getVotes();
            });
        });
        return listBadges.toArray();
    }

}