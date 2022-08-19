package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.util.Set;

@Data
@Entity
@Table(name ="gumruk")
public class Gumruk {

    @OneToMany
    @JoinColumn(name = "id")
    private Set<Beyanname> beyanname;

    @OneToMany
    @JoinColumn(name = "id")
    private Set<Beyanname> beyanname2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String gumruk_ad;
    private String int_kod;
    private String adres;
    private String gumruk_tip;
}
