package com.ticket.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CrollingDto {

    private String title;
    private String place;
    private String date;
    private String runtime;
    private String ageLimit;

    private String posterUrl;

    private List<String> seatLevel;
    private List<String> price;
    private List<String> imgUrl;

    private List<String> character;
    private List<String> actorName;
    private List<String> actorImgUrl;

}
