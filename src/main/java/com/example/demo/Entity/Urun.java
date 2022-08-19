package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "urun")
public class Urun {

    @OneToMany
    @JoinColumn(name = "id")
    private Set<Beyanname> beyanname;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String urun_ad;
    private String int_kod;
    private Integer brut_agirlik;
    private Integer net_agirlik;
    private Integer mal_bedeli;

}
