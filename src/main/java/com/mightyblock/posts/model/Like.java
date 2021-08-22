package com.mightyblock.posts.model;

import lombok.Getter;

import java.io.Serializable;
import java.time.Clock;
import java.util.Date;

@Getter
public class Like implements Serializable {

    private String userId;
    private Date likeDate;

    public Like(String userId, Clock now){
        this.userId = userId;
        this.likeDate = new Date(now.millis());
    }
}
