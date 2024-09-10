package com.sparta.basicspringsession9.repository;

import com.sparta.basicspringsession9.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
