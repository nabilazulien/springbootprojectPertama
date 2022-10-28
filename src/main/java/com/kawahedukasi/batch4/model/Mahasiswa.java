package com.kawahedukasi.batch4.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.UUID;

@Entity
@Setter
@Getter
@ToString
public class Mahasiswa {
    //model tabel mahasiswa
    @Id
    @Type(type=("uuid-char"))
    private UUID idNo;
    private String nama;
    private String noTelepon;
    private String email;
    private String domisili;
}
