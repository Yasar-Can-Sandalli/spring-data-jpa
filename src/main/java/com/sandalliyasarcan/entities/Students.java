package com.sandalliyasarcan.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student")
public class Students {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //oto increment
    private Integer id; //int vs Integer >

    @Column(name = "first_name" , nullable = false)
    private String firstName;

    @Column(name = "last_name" , nullable = false)
    private String lastName;

    @Column(name = "birth_of_date" , nullable = true)
    private Date birthOfDate;

}
