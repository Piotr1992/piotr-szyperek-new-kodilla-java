package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Badges {

    @JsonProperty("id")
    private String id;

    @JsonProperty("votes")
    private String votes;

    @JsonProperty("attachments")
    private List<AttachmentsByType> attachments;

}





/*    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }               */

    /*    @SuppressWarnings("unchecked")
    @JsonProperty("brand")
    private void unpackNested(Map<String,Object> brand) {
        this.brandName = (String)brand.get("name");
        Map<String,String> owner = (Map<String,String>)brand.get("owner");
        this.ownerName = owner.get("name");
    }           */

