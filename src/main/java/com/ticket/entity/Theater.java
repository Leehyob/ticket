package com.ticket.entity;

import com.ticket.dto.ContentDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "theater")
@Getter
@Setter
public class Theater {

    //극장 - 극장코드, 극장명
    @Id
    @Column(name = "theater_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "theater_name")
    private String name;

    private String theater_seat;

    @OneToMany(mappedBy = "theater", fetch = FetchType.LAZY)
    private List<Seat> seats;

    public void updateTheater(ContentDto contentDto) {
        this.name = contentDto.getTheater();
    }
}
