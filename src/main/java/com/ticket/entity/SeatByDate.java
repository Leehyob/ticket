package com.ticket.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "seat_date")
@Getter
@Setter
public class SeatByDate {

    //날짜별 좌석 - 날짜, 좌석 코드,  좌석 예매 여부(boolean),예약자명

    @Id
    @Column(name = "seat_date_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_code")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "content_code")
    private Content content;

    private boolean reservation;

}
