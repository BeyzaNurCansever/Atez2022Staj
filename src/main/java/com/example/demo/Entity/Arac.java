package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name="Arac")
public class Arac {

    @OneToMany
    @JoinColumn(name = "id")
    private Set<Beyanname> beyanname;


    @ManyToOne
    @JoinColumn(name = "firma_id")
    private Firma firma;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String plaka;
    private String arac_tip;




}
