package com.ticket.dto;

import com.ticket.entity.Content;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ContentDto {

    private Long contentId;

    private String contentName;

    private int price;

    private String genre;

    private String posterUrl;

    private String theater;

    private String date;

    public Content createItem(){
        return null;
    }
}
