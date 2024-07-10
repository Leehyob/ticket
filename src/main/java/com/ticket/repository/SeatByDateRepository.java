package com.ticket.repository;

import com.ticket.entity.Seat;
import com.ticket.entity.SeatByDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatByDateRepository extends JpaRepository<SeatByDate, Long> {

    List<SeatByDate> findByDate(String date);

}
