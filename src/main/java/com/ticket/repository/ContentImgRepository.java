package com.ticket.repository;

import com.ticket.entity.Content;
import com.ticket.entity.ContentImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContentImgRepository extends JpaRepository<ContentImg, Long> {

    List<ContentImg> findByContentId(Long contentId);
}
