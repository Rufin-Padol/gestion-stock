package com.ruf.gestion.entity;

import com.ruf.gestion.enumm.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Long Id;

    @Column(name = "nom" ,nullable = false)
    private  String first_name;

    @Column(name = "prenom" ,nullable = false)
    private  String last_name;

    @Column(name = "email" ,nullable = false ,unique = true )
    @Email
    private  String email;

    @Column(name = "ddn" ,nullable = false)
    private  String ddn ;

    @Column(name = "sexe" ,nullable = false)
    private  Genre sexe ;

    @Column(name = "date_create" ,nullable = false)
    @DateTimeFormat(pattern = "yyyy-mm-jj/hh-mm-ss")
    private  LocalDateTime create_client;

    @Column(name = "date_update" ,nullable = false)
    @DateTimeFormat(pattern = "yyyy-mm-jj/hh-mm-ss")
    private  LocalDateTime update_client;


}
