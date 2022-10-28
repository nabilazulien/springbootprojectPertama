package com.kawahedukasi.batch4.repository;

import com.kawahedukasi.batch4.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository <People, Long> {
}
