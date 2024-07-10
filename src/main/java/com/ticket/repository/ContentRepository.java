package com.ticket.repository;

import com.ticket.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {

    List<Content> findByGenre(String genre);

    Content findById(long id);
}
