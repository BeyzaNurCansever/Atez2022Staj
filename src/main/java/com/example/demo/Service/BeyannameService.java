package com.example.demo.Service;

import com.example.demo.Entity.Arac;
import com.example.demo.Entity.Beyanname;
import com.example.demo.Entity.Firma;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BeyannameService {
    List<Beyanname> listBeyanname();
    Optional<Firma> findById(Integer id);
}
