package com.ticket.dto;

import com.ticket.entity.Actor;
import com.ticket.entity.ContentImg;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContentDtlDto {

    private Long contentId;

    private String contentName;

    private String runtime;

    private String theaterName;

    private String genre;

    private String ageLimit;

    private String posterUrl;

    private String date;

    private int price;

    List<Actor> actorList;

    List<ContentImg> contentImgList;
}
