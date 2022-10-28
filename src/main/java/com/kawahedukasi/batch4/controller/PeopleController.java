package com.kawahedukasi.batch4.controller;

import com.kawahedukasi.batch4.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @PostMapping("/savePeople")
    public ResponseEntity<String> simpanPeople(
            @RequestParam("nama") String nama,
            @RequestParam("TTL") String TTL,
            @RequestParam("gender") String gender,
            @RequestParam("alamat") String alamat
    ){
        ResponseEntity<String> stringResponseEntity = peopleService.peoplesave(nama, TTL, gender, alamat);
        return stringResponseEntity;
    }
}
