package com.ticket.repository;

import com.ticket.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SeatRepository extends JpaRepository<Seat, Long> {

    List<Seat> findByTheater_Id(Long theater_code);

    Seat findSeatById(Long id);


}
