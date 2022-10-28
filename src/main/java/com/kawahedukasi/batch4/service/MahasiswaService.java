package com.kawahedukasi.batch4.service;

import com.kawahedukasi.batch4.model.Mahasiswa;
import com.kawahedukasi.batch4.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;
    public ResponseEntity<String> mahasiswaSave(String nama, String email, String noTelepon, String domisili){
//        instansiasi Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setIdNo(UUID.randomUUID());
        mahasiswa.setNama(nama);
        mahasiswa.setEmail(email);
        mahasiswa.setNoTelepon(noTelepon);
        mahasiswa.setDomisili(domisili);
//        simpan mahasiswa
        mahasiswaRepository.save(mahasiswa);
        //return respon
        return ResponseEntity.ok("idNo: " +mahasiswa.getIdNo());

    }
}
