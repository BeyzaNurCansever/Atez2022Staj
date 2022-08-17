package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Beyanname")

public class Beyanname {

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
    private java.sql.Date tarih;
    private Integer cikis_gumruk;
    private Integer varis_gümrük;
    private Integer urun;






}
