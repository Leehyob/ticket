package com.ticket.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "run_date")
@Getter
@Setter
@ToString
public class TimeTable {

    //공연 날짜 - 컨텐츠 코드, 공연 연월일, 시간

    @Id
    @Column(name = "time_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    private Time time;

    private String days;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_code")
    private Content content;

    private String actorName;
}
