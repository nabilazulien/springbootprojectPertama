package com.kawahedukasi.batch4.service;

import com.kawahedukasi.batch4.model.People;
import com.kawahedukasi.batch4.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;
    public ResponseEntity<String> peoplesave(String nama, String TTL, String gender, String alamat){
        People people = new People();
        people.setIdNo(UUID.randomUUID());
        people.setNama(nama);
        people.setTTL(TTL);
        people.setGender(gender);
        people.setAlamat(alamat);
        peopleRepository.save(people);
        return ResponseEntity.ok("IdNo: " +people.getIdNo());
    }
}
