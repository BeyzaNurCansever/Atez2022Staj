package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Firma")
@Data

public class Firma {

    @OneToMany
    @JoinColumn(name = "id")
    private Set<Beyanname> beyanname;

    @OneToMany
    @JoinColumn(name = "id")
    private Set<Beyanname> beyanname2;

    @OneToMany
    @JoinColumn(name="id")
    private Set<Arac> arac;
    @OneToOne
    @JoinColumn(name = "gonderici_adres")
    private Adres adres;
    @OneToOne
    @JoinColumn(name = "alici_adres")
    private Adres adres2;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private Integer id;
    @Column(name = "firma_ad")
    private String firma_ad;
    @Column(name = "vergi_numarası")
    private String vergi_numarası;



}
