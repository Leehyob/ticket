package com.ticket.entity;

import com.ticket.dto.ContentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Content {

    //content - content_code(pk), content_name, date, actor, price, theater_code
    //컨텐츠 정보 - 컨텐츠 코드, 컨텐츠 이름, 관람시간, 배우 이름,
    //		 가격, 극장코드, 컨텐츠 종류, 관람 연령, 공연 기간(공연 시작일, 공연 종료일)

    @Id
    @Column(name = "content_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentName;

    private String runtime;

    private int price;

    private Long theaterCode;

    private String genre;

    private String ageLimit;

    private String posterUrl;

    private String date;

    @OneToMany(mappedBy = "content")
    private List<Actor> actorList = new ArrayList<>();

    @OneToMany(mappedBy = "content")
    private List<ContentImg> contentImgList = new ArrayList<>();

    public void updateContent(ContentDto contentDto){
        this.contentName = contentDto.getContentName();
        this.price = contentDto.getPrice();
        this.genre = contentDto.getGenre();
        this.posterUrl = contentDto.getPosterUrl();
    }

}
