package com.ticket.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "content_price")
@Getter
@Setter
public class ContentPrice {

    //가격 - 컨텐츠 코드, 좌석 등급, 가격

    @Id
    @Column(name = "price_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatLevel;

    private String price;

    @ManyToOne
    @JoinColumn(name = "content_code")
    private Content content;

}
