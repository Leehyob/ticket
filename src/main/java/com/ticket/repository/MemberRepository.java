package com.ticket.repository;

import com.ticket.entity.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member findByEmail(String email);

    @Query("select m from Member m order by m.id desc")
    List<Member> findAllDesc(Pageable pageable);

    @Query("select count(m) from Member m order by m.id desc")
    Long countMember();

}
