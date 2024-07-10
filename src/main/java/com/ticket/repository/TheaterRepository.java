package com.ticket.repository;

import com.ticket.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {

    Theater findById(Long theaterCode);

    Theater findByName(String name);

    Boolean existsByName(String name);
}
