package com.ticket.repository;

import com.ticket.entity.Main;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MainRepository extends JpaRepository<Main, Long> {

    List<Main> findByMaking(String useIn);
}
