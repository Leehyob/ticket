package com.ticket.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seat")
@Getter
@Setter
public class Seat {

    //좌석 - 극장코드, 좌석 코드, 층, 구역, 열, 번

    @Id
    @Column(name = "seat_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theater_code")
    private Theater theater;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_code")
    private List<SeatByDate> seatByDate;

    private String floor;

    private String area;

    private String line;

    private String seatNumber;

    private String grade;

    private String seatImg;

    private int x;
    private int y;

}
