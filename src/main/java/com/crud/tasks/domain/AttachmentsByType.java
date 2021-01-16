package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

//@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttachmentsByType {

    @JsonProperty("id")
    private String id;

    @JsonProperty("votes")
    private String votes;

//    @JsonProperty("trello")
//    private List<Trello> trello;
}


