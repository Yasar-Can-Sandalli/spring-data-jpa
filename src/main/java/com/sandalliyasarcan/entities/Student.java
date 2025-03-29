package com.sandalliyasarcan.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @Column(name = "student_id") // veritabaninda yer alan tabloda kolon adi
    @GeneratedValue(strategy = GenerationType.IDENTITY) //otomatik arttirma
    private Integer studentId;

    @Column(name = "first_name", nullable = false, length = 40) // Bos (null) gecilemez ve girilen metin max 30 karakter olabilir
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 40 )
    private String lastName;

    @Column(name = "birth_of_date", nullable = true) //Default olarak nullable true olmaktadir
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthOfDate;

}
