package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name="Beyanname")

public class Beyanname {


    @ManyToOne
    @JoinColumn(name = "varis_gumruk_id")
    private Gumruk varis_gumruk;

    @ManyToOne
    @JoinColumn(name = "cikis_gumruk_id")
    private Gumruk cikis_gumruk;


    @ManyToOne
    @JoinColumn(name = "urun_id")
    private Urun urun;

    @ManyToOne
    @JoinColumn(name = "alici_firma_id")
    private Firma alici_firma;

    @ManyToOne
    @JoinColumn(name = "gonderici_firma_id")
    private Firma gonderici_firma;



    @ManyToOne
    @JoinColumn(name = "tasiyici_arac_id")
    private Arac arac;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tescil_id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate tarih;








}
