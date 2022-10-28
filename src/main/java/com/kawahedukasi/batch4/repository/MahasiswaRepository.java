package com.kawahedukasi.batch4.repository;

import com.kawahedukasi.batch4.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepository extends JpaRepository <Mahasiswa, Long>{
}
