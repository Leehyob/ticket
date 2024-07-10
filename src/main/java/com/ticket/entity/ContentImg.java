package com.ticket.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "content_img")
@Getter
@Setter
@ToString
public class ContentImg {

//    컨텐츠 이미지 - 컨텐츠 이미지 코드, 컨텐츠 이미지 이름, 컨텐츠 이미지 url,
//		컨텐츠 오리지널 이미지 이름, 컨텐츠 대표 이미지(boolean),
//		 컨텐츠 코드

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_img_code")
    private Long id;

    private String contentImgName;

    private String contentImgUrl;

    private String contentOriName;

    private String thumbnail;

    @ManyToOne
    @JoinColumn(name = "content_code")
    private Content content;

}
