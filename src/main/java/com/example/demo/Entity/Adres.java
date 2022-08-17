package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="adres")
public class Adres {

    @OneToOne
    @JoinColumn(name = "id")
    private Firma firma;
    @OneToOne
    @JoinColumn(name = "id")
    private Firma firma2;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ülke;
    private String sehir;
    private String ilce;
    private String detay;


}
