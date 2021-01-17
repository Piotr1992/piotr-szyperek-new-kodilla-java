package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

//@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trello {
/*    @JsonProperty("id")
    private String id;      */

    @JsonProperty("board")
    private String board;

    @JsonProperty("card")
    private String card;
}


