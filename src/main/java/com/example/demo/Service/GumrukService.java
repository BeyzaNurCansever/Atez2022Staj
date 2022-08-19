package com.example.demo.Service;

import com.example.demo.Entity.Gumruk;
import com.example.demo.Entity.Urun;

import java.util.Optional;

public interface GumrukService {


    Optional<Gumruk> findById(Integer id);
}
