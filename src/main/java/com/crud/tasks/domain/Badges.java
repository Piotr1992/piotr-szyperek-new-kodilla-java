package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Badges {
    @JsonProperty("votes")
    private String votes;

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

//    @JsonProperty("attachments")
//    private AttachmentsByType attachments;
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

