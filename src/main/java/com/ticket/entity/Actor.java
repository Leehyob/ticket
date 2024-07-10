package com.ticket.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "actor")
@ToString
public class Actor {

    //배우 - 배우 이름, 배우 프로필, 배우 이미지

    @Id
    @Column(name = "actor_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String actorName;

    private String actImgUrl;

    private String nameOfRole;

    @ManyToOne
    @JoinColumn(name = "content_code")
    private Content content;

}
