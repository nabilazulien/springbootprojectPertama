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
public class People {
    @Id
    @Type(type=("uuid-char"))
    private UUID idNo;
    private String nama;
    private String TTL;
    private String gender;
    private String alamat;
}
