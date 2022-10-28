package com.kawahedukasi.batch4.controller;

import com.kawahedukasi.batch4.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class MahasiswaController {
    @Autowired
    MahasiswaService mahasiswaService;

    @PostMapping("/saveMahasiswa")
    public ResponseEntity<String> simpanMahasiswa(
            @RequestParam("nama") String nama,
            @RequestParam("email") String email,
            @RequestParam("noTelepon") String noTelepon,
            @RequestParam("domisili") String domisili
    ) {
        ResponseEntity<String> stringResponseEntity = mahasiswaService.mahasiswaSave(nama, email, noTelepon, domisili);
        return stringResponseEntity;

    }
}
